package com.college.action;
import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DownloadAction;
import org.apache.struts.actions.DownloadAction.FileStreamInfo;

import com.college.dto.AccountDto;
import com.college.exception.RecordNotFountException;
import com.college.pdf.generator.PDFGenerator;


public class VoucherReportDownloadAction extends DownloadAction{

	@Override
	protected StreamInfo getStreamInfo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse res) throws Exception {
		File file = null;
		String contentType =null;
		DynaActionForm daf = (DynaActionForm)form;
		String txIds [] =  daf.getStrings("mTxId");
		ServletContext ctx =request.getSession().getServletContext();
		List<AccountDto> accountDtoList = (List<AccountDto>)request.getSession().getAttribute("ADL");
		String fileName = PDFGenerator.generateVoucher(accountDtoList ,ctx ,txIds);
		if(txIds.length ==0){
		throw new RecordNotFountException();
		}else{
		if(fileName !=null){
			String path = ctx.getRealPath("/")+"Voucher";
			file = new File(path+"/"+fileName);
			contentType = ctx.getMimeType(file.getName());
			if(contentType == null){
				contentType = "application/octet-stream";
			}
			res.setHeader("Content-disposition","attachment;filename="+fileName);
			res.setContentLength((int) file.length());
				
		}
		}
		return new FileStreamInfo(contentType, file);	
	}
}
