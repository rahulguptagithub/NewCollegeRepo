package com.college.action;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.college.dao.CLGDao;
import com.college.dao.CLGDaoImpl;
import com.college.dto.AcademicRecordsDto;
import com.college.dto.OtherRecordDTO;
import com.college.dto.StudentDto;
import com.college.form.AdmissionForm;
import com.college.pdf.generator.PDFGenerator;
import com.college.student.impl.StudentImpl;
import com.college.student.impl.StudentInterface;

public class AdmissionFormUploadAction extends CollegeBaseDispatchAction {
	StudentInterface studentInterface = null;
	CLGDao cLGDao = null;
	String result;

	public ActionForward submitStudentForm(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		result = "fail";
		System.out.println("entering to execute method of AdmissionFormUploadAction");
		AdmissionForm admissionForm = (AdmissionForm) form;
		FormFile image = (FormFile) admissionForm.getPhoto();
		ServletContext ctx = request.getSession().getServletContext();
		String filePath = ctx.getRealPath("/") + "photo";
		String fileName = image.getFileName();
		System.out.println("filePath\t" + filePath);
		File folder = new File(filePath);
		if (!folder.exists()) {
			folder.mkdir();
		}
		if (!("").equals(fileName)) {
			String userName = (String) request.getSession().getAttribute("userName");
			studentInterface = new StudentImpl();
			StudentDto studentDto = studentInterface.populateStudentDetails(admissionForm, userName);
			cLGDao = new CLGDaoImpl();
			String sid = cLGDao.saveStudent(studentDto);
			if (sid != null) {
				request.setAttribute("message",
						"Form Submitted successfully against Student Id\t" + sid + "\tDownload Fee Receipt");
				// request.setAttribute("file","Student"+"MTPJPL-001.pdf");
				String fileNewName = sid + ".jpeg";
				File newFile = new File(filePath, fileNewName);
				if (!newFile.exists()) {
					FileOutputStream fos = new FileOutputStream(newFile);
					fos.write(image.getFileData());
					fos.flush();
					fos.close();
				}
				if (admissionForm.getAcademicRecordsList() != null) {
					List<AcademicRecordsDto> academicRecordsList = admissionForm.getAcademicRecordsList();
					filePath = ctx.getRealPath("/") + "AcademicRecords";
					folder = new File(filePath);
					if (!folder.exists()) {
						folder.mkdir();
					}
					for (AcademicRecordsDto academicRecordsDto : academicRecordsList) {
						fileNewName = sid + "_" + academicRecordsDto.getExamName() + "."
								+ this.getFileExtension(academicRecordsDto.getUploadFile());
						newFile = new File(filePath, fileNewName);
						if (!newFile.exists()) {
							FileOutputStream fos = new FileOutputStream(newFile);
							fos.write(academicRecordsDto.getUploadFile().getFileData());
							fos.flush();
							fos.close();
						}
					}

				}
				if (admissionForm.getOtherRecordDTOList() != null) {
					List<OtherRecordDTO> otherRecordDTOList = admissionForm.getOtherRecordDTOList();
					filePath = ctx.getRealPath("/") + "OtherRecords";
					folder = new File(filePath);
					if (!folder.exists()) {
						folder.mkdir();
					}
					for (OtherRecordDTO otherRecordDTO : otherRecordDTOList) {
						fileNewName = sid + "_" + otherRecordDTO.getCertificateName() + "."
								+ this.getFileExtension(otherRecordDTO.getUploadFile());
						newFile = new File(filePath, fileNewName);
						if (!newFile.exists()) {
							FileOutputStream fos = new FileOutputStream(newFile);
							fos.write(otherRecordDTO.getUploadFile().getFileData());
							fos.flush();
							fos.close();
						}
					}

				}
				PDFGenerator pdfGeneretor = new PDFGenerator();
				String receiptName = pdfGeneretor.generatoFeeReceipt(studentDto, sid, ctx);
				request.setAttribute("file", receiptName);

				// pdfGeneretor.generatoFeeReceipt(studentDto , sid ,
				// fileNewName ,ctx);
				result = "success";
			}
		}

		return mapping.findForward(result);
	}

	public ActionForward addRemoveFileRecord(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		AdmissionForm admissionForm = (AdmissionForm) form;
		if ("academicRecord".equalsIgnoreCase(admissionForm.getCallType())) {
			if ("add".equalsIgnoreCase(admissionForm.getCallFor())) {
				admissionForm.getAcademicRecordsList().add(admissionForm.getAcademicRecordDTO());
				admissionForm.setAcademicRecordDTO(new AcademicRecordsDto());
			} else if ("remove".equalsIgnoreCase(admissionForm.getCallFor())) {
				List<AcademicRecordsDto> academicRecordsList = admissionForm.getAcademicRecordsList();
				int i = 0;
				for (Iterator<AcademicRecordsDto> iterator = academicRecordsList.iterator(); iterator.hasNext();) {
					AcademicRecordsDto academicRecordsDto = (AcademicRecordsDto) iterator.next();
					if (i++ == Integer.valueOf(admissionForm.getIndexId())) {
						iterator.remove();
						break;
					}
				}
			}

		} else if ("otherRecord".equalsIgnoreCase(admissionForm.getCallType())) {
			if ("add".equalsIgnoreCase(admissionForm.getCallFor())) {
				admissionForm.getOtherRecordDTOList().add(admissionForm.getOtherRecordDTO());
				admissionForm.setOtherRecordDTO(new OtherRecordDTO());
			} else if ("remove".equalsIgnoreCase(admissionForm.getCallFor())) {
				List<OtherRecordDTO> otherRecordList = admissionForm.getOtherRecordDTOList();
				int i = 0;
				for (Iterator<OtherRecordDTO> iterator = otherRecordList.iterator(); iterator.hasNext();) {
					OtherRecordDTO otherRecordDTO = (OtherRecordDTO) iterator.next();
					if (i++ == Integer.valueOf(admissionForm.getIndexId())) {
						iterator.remove();
						break;
					}
				}
			}
		}
		return mapping.findForward("admission");
	}

	private String getFileExtension(FormFile file) {
		String name = file.getFileName();
		try {
			return name.substring(name.lastIndexOf(".") + 1);
		} catch (Exception e) {
			return "";
		}
	}
}
