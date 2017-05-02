package com.college.pdf.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import com.college.dto.FeeStructureDto;
import com.college.dto.StudentDto;
import com.college.util.NumToWordsUtil;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class PDFGenerator {
	
	public String generatoFeeReceipt(StudentDto studentDto ,String sid ,ServletContext ctx){
		Document document = new Document();
		String fileName =sid+".pdf";
		String filePath = ctx.getRealPath("/")+"MoneyReceipt";
		File folder = new File(filePath);
	    if(!folder.exists()){
		folder.mkdir();
		}
	    File newFile = new File(filePath,fileName );
        try {
        	
        	String strArr[] = sid.split("-");
        	String receipt_no = strArr[1];
            PdfWriter.getInstance(document, new FileOutputStream(newFile));
            document.open();
            Chunk blank =new Chunk("                                                                     ");
            document.add(blank);//for printing money receipt in center of page
            Chunk underline = new Chunk("Money Receipt");
            underline.setUnderline(0.2f, -2f); //0.1 thick, -2 y-location
            document.add(underline);
            Paragraph paragraph = new Paragraph("MAHARANA PRATAP Pvt. I.T.I");
           
            paragraph.setSpacingBefore(10);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            Paragraph address = new Paragraph("Chiraiya Khar,Japla (Jharkhand)");
            address.setAlignment(Element.ALIGN_CENTER);
            document.add(address);
            
            PdfPTable table = new PdfPTable(4); // 3 columns.
            table.setSpacingBefore(25);
            PdfPCell cell11 = new PdfPCell(new Paragraph("Receipt No.#"));
            PdfPCell cell12 = new PdfPCell(new Paragraph(receipt_no));
            PdfPCell cell13 = new PdfPCell(new Paragraph("Date: "));
            PdfPCell cell14 = new PdfPCell(new Paragraph((new java.sql.Date(new Date().getTime())).toString()));

            table.addCell(cell11);
            table.addCell(cell12);
            table.addCell(cell13);
            table.addCell(cell14);
            
            PdfPCell cell21 = new PdfPCell(new Paragraph("Student Name"));
            PdfPCell cell22 = new PdfPCell(new Paragraph(studentDto.getStudent_name()));
            PdfPCell cell23 = new PdfPCell(new Paragraph("Student ID #"));
            PdfPCell cell24 = new PdfPCell(new Paragraph(sid));
            table.addCell(cell21);
            table.addCell(cell22);
            table.addCell(cell23);
            table.addCell(cell24);
            
            
            PdfPCell cell31 = new PdfPCell(new Paragraph("Trade"));
            PdfPCell cell32 = new PdfPCell(new Paragraph(studentDto.getTrade()));
            PdfPCell cell33 = new PdfPCell(new Paragraph("Session"));
            PdfPCell cell34 = new PdfPCell(new Paragraph(studentDto.getSession()));
            
            table.addCell(cell31);
            table.addCell(cell32);
            table.addCell(cell33);
            table.addCell(cell34);
            
            document.add(table);
            
            
            Paragraph receivedFrom = new Paragraph("                Received with thanks from             " + studentDto.getStudent_name());
	           
            receivedFrom.setSpacingBefore(10);
            document.add(receivedFrom);
            
            Paragraph guardian = new Paragraph("                Son/Daughter/Gaurdian of              " + studentDto.getGuardian_name());
	           
            guardian.setSpacingBefore(10);
            document.add(guardian);

            Paragraph roll_no = new Paragraph("                Roll No.#             " + "YYY" +"                Rupees      "+ NumToWordsUtil.convert((int)studentDto.getFee()) +"   Only" );
	           
            roll_no.setSpacingBefore(10);
            document.add(roll_no);
           
            PdfPTable rsTable = new PdfPTable(1);
            PdfPCell cell00 = new PdfPCell(new Paragraph("Rs.    "+ (int)studentDto.getFee() + "/-"));
            cell00.setBorder(2);
            rsTable.addCell(cell00);
            rsTable.setSpacingBefore(20);
            document.add(rsTable);
            Paragraph signature = new Paragraph("                                                       																																										Authorized Singnatory ");
            signature.setSpacingBefore(20);
            document.add(signature);
            document.close();
        } catch(Exception e){
e.printStackTrace();
        }

		return fileName;
        	}
	
	/**
	 * Creates a PDF document.
	 * @param filename the path to the new PDF document
	 * @throws    DocumentException 
	 * @throws    IOException 
	 */
	public static String createPDFAdmissionForm(ServletContext ctx , long formNo) throws DocumentException, IOException {

		Document document = new Document();
		String fileName ="AdmissionFormNo"+formNo+".pdf";
		String filePath = ctx.getRealPath("/")+"AdmissionForm";
		File folder = new File(filePath);
	    if(!folder.exists()){
		folder.mkdir();
		}
	    File newFile = new File(filePath, fileName );
	    PdfWriter.getInstance(document, new FileOutputStream(newFile));
	    document.open();
	    Chunk blank =new Chunk("                                   ");
	    document.add(blank);
	    Font ft= new Font();
	    ft.setSize(20);
	    Chunk underline = new Chunk("MAHARANA PRATAP Pvt. ITI");
	    underline.setUnderline(0.2f, -2f);
	    underline.setFont(ft);
	    document.add(underline);
	    Paragraph space = new Paragraph ("");
	    document.add(space);
	    Chunk blank2 =new Chunk("                                              ");
	    document.add(blank2);
	    Font f1t= new Font();
	    f1t.setSize(15);
	    Chunk underline2 = new Chunk("Chiraiya Khar,Japla(Jharkhand)");
	    underline2.setFont(f1t);
	    document.add(underline2);
	    Paragraph admissionslip = new Paragraph ("                                                           ADMISSION SLIP" + "                            Form No "+ formNo);
	    document.add(admissionslip);
	    Paragraph iNots1 = new Paragraph ("Important Notes :- (i)Before filling this form,read instructions given in prospectous carefully ");
	    iNots1.setSpacingBefore(5);
	    document.add(iNots1);
	    Paragraph iNots2 = new Paragraph ("                              (ii)All entries should be made in BLOCK LETTER ");
	    iNots2.setSpacingBefore(5);
	    document.add(iNots2);
	    Paragraph tradePrefer = new Paragraph ("TRADE AS PER PREFERENCE"
	    		+ "            [   ] ELECTRICAL      [   ] FITTER");
	    tradePrefer.setSpacingBefore(5);
	    document.add(tradePrefer);
	    Paragraph name = new Paragraph ("1. Name of the candidate: "+" ________________________________________________");
	    name.setSpacingBefore(10);
	    document.add(name);
	    Paragraph guardinaType =  new Paragraph("2. Father's/Guardian Name :(Please Select Guardian Type)              Father     Guardian    " ) ;
	    guardinaType.setSpacingBefore(10);
	    document.add(guardinaType); 
	    Paragraph guardinaName = new Paragraph (" ______________________________________________________________________");
	    guardinaName.setSpacingBefore(10);
	    document.add(guardinaName);
	    Paragraph guardinaProfession = new Paragraph ("3. Father's/Guardian Profession:_____________________________________________");
	    guardinaProfession.setSpacingBefore(10);
	    document.add(guardinaProfession);
	    Paragraph dob = new Paragraph ("4. Date of Birth              ___ /___/______                       Age as on 1-8-20___[   ] [   ] ");
	    document.add(dob);
	    Paragraph category = new Paragraph ("5. Category:    GEN [   ]    OBC [   ]    SC [   ]   ST [   ] ");
	    document.add(category);
	    Paragraph ma = new Paragraph ("6. Mailing Address of Candidate With Name:");
	    ma.setSpacingBefore(10);
	    document.add(ma);
	    Paragraph maname = new Paragraph ("    Name:_________________________________________");
	    document.add(maname);
	    Paragraph maVillage = new Paragraph ("    Village:________________________________________");
	    document.add(maVillage);
	    Paragraph maPO = new Paragraph ("    PO:_______________________ PS:_________________");
	    document.add(maPO);
	    Paragraph maDistrict = new Paragraph ("    District:_______________ Ph No. ___________________" );
	    document.add(maDistrict);
	    Paragraph pa = new Paragraph ("7. Permanent address:");
	    pa.setSpacingBefore(10);
	    document.add(pa);
	    Paragraph paVillage = new Paragraph ("    Village:________________________________________");
	    document.add(paVillage);
	    Paragraph paPO = new Paragraph ("    PO:_______________________ PS:_________________");
	    document.add(paPO);
	    Paragraph paDistrict = new Paragraph ("    District:_______________ Ph No. ___________________" );
	    document.add(paDistrict);
	    Paragraph acadRecode = new Paragraph ("8. Academic Qualification:");
	    acadRecode.setSpacingBefore(10);
	    document.add(acadRecode);
	    PdfPTable table = new PdfPTable(7);
	    table.setSpacingBefore(15);
	    table.setWidthPercentage(100);
	    table.addCell("S.No");
	    table.addCell("Exam Passed");
	    table.addCell("Year Of Passing");
	    table.addCell("Name of School/     College");
	    table.addCell("Board/             Council");
	    table.addCell("Division");
	    table.addCell("% of Marks");

	    for(int i=1 ; i<4 ;i++){
	    	table.addCell(""+i);
	    	for(int x=0;x<6;x++){
	    		table.addCell("");
	    	}
	    }
	    
	    document.add(table);
	    Paragraph terms = new Paragraph ("             I , hereby certified that the entries made by me in this form are correct to the best of my knowledge. I shall abide by the rules and regulation"
	    +" of the institution in        during the course of my stay and understand that the institute reserves the right to cancel my admission       ."+"I have also understood that the fee once paid is neither refundable nor transferable.");
	    document.add(terms);
	    Paragraph dd = new Paragraph ("  DD/MO/MR NO.________________ Amount_________________Date Of Issue ____________");
	    document.add(dd);
	    Paragraph enclosure = new Paragraph ("Other Enclosures______________");
	    document.add(enclosure);
	    Paragraph dd1 = new Paragraph ("1.");
	    document.add(dd1);
	    Paragraph dd2 = new Paragraph ("2.                                                                                                      "
	    		+ "        Signature of the Candidate");
	    document.add(dd2);
	    
	    Paragraph dd3 = new Paragraph ("3.                                                                                                      "
	    		+ "            Date _______________");
	    document.add(dd3);
	    Paragraph ermsGuardian = new Paragraph("               I , hereby offer an undertaking that I shall not induldge in any act of indecipline during the stay at the institute,"
	    		+ " and will pay this fees and dues in time. "
	    		+ "I promise to pay the full amount of course fee within a year as per rule mentioned in the prospectus.");
	    ermsGuardian.setSpacingBefore(10);
	    document.add(ermsGuardian);
	    Paragraph sigGuardian = new Paragraph ("                                                                                                         "
	    		+ "     Signature of Father/Guardian");
	    sigGuardian.setSpacingBefore(10);
	    document.add(sigGuardian);
	    Paragraph enclose = new Paragraph ("NOTE:1.Enclose the certificate for age and qualification (Attached xerox copies of the mark sheet)");
	    enclose.setSpacingBefore(10);
	    document.add(enclose);
	    Paragraph enclose2 = new Paragraph ("           2.SLC/CLC");
	    document.add(enclose2);
	    Paragraph enclose3 = new Paragraph ("                        LAST DATE OF RECEIPT OF APPLICATION FORM 18 _________________");
	    document.add(enclose3);
	    Paragraph line = new Paragraph ("- - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
	    document.add(line);
	    Paragraph recv = new Paragraph ("                                                                RECEVING SLIP               "
	    		+ "            Form No __________");
	    recv.setSpacingBefore(10);
	    document.add(recv);
	    Paragraph name_of_candidate = new Paragraph ("1.Name Of The Candidate ________________________________________________________");
	    name_of_candidate.setSpacingBefore(10);
	    document.add(name_of_candidate);
	    Paragraph guardianName = new Paragraph ("2.Father/Guardian's Name ________________________________________________________");
	    guardianName.setSpacingBefore(10);
	    document.add(guardianName);
	    
	    Paragraph address = new Paragraph ("3.Address _____________________________________________________________________");
	    address.setSpacingBefore(10);
	    document.add(address);
	    Paragraph entrance = new Paragraph ("4.Entrance Last Held On _____________ DD/MO/MR No ______________ Amount __________");
	    entrance.setSpacingBefore(10);
	    document.add(entrance);
	    Paragraph sigRecspace = new Paragraph ("");
	    sigRecspace.setSpacingBefore(10);
	    document.add(sigRecspace);
	    Paragraph sigRec = new Paragraph ("                                                                                                      "
	    		+ "                   Signature Of Reciever ");
	    sigRec.setSpacingBefore(23);
	    document.add(sigRec);
	    document.close();
	    System.out.println("PDF generated");
	    return fileName;
	}
	
	
	public static String createFeeStructurePDF(List<FeeStructureDto> feeStructureDtoList , ServletContext ctx){
		String fileName = null;
	if(feeStructureDtoList !=null && feeStructureDtoList.size()>0){
			String session =feeStructureDtoList.get(0).getSession();
			Document document = new Document();
			fileName ="feeStructure"+session+".pdf";
			String filePath = ctx.getRealPath("/")+"FeeStructure";
			File folder = new File(filePath);
		    if(!folder.exists()){
			folder.mkdir();
			}
		    File newFile = new File(filePath,fileName );
	        try {
	        	
	        	
	            PdfWriter.getInstance(document, new FileOutputStream(newFile));
	            document.open();
	            Paragraph space = new Paragraph ("");
	            document.add(space);
	            Font ft= new Font();
	    	    ft.setSize(18);
	    	    Chunk heading = new Chunk("                            MAHARANA PRATAP Pvt. ITI");
	    	   // heading.setUnderline(0.2f, -2f);
	    	    heading.setFont(ft);
	    	    
	    	    document.add(heading);
	    	    
	    	    document.add(space);
	    	    Chunk blank2 =new Chunk("                                              ");
	    	    document.add(blank2);
	    	    Font f1t= new Font();
	    	    f1t.setSize(15);
	    	    Chunk address = new Chunk(" Chiraiya Khar,Japla(Jharkhand)");
	    	    address.setFont(f1t);
	    	    document.add(address);
	    	    
	    	    
	            Paragraph title = new Paragraph("Fee Structure chargeable for tainees admitted in different course for the session    "+ session );
	            title.setSpacingBefore(5);
	            
	            document.add(title);
	            int columnsNo = feeStructureDtoList.size()+2;
	            PdfPTable table = new PdfPTable(columnsNo);
	            
	            table.setSpacingBefore(25);
	             PdfPCell slNo1 = new PdfPCell(new Paragraph("1"));
	             PdfPCell tradeTitle = new PdfPCell(new Paragraph("Trade Name"));
	             table.addCell(slNo1);
	             table.addCell(tradeTitle);
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getTrade()));
	            	 table.addCell(cell);
	            }
	            
	            
	            PdfPCell slNo2 = new PdfPCell(new Paragraph("2"));
	            PdfPCell duration = new PdfPCell(new Paragraph("Duration"));
	            table.addCell(slNo2);
	            table.addCell(duration);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getDuration()+""));
	            	 table.addCell(cell);
	            }
	            
	            PdfPCell slNo3 = new PdfPCell(new Paragraph("3"));
	            PdfPCell admissionFee = new PdfPCell(new Paragraph("Admission Fee"));
	            table.addCell(slNo3);
	            table.addCell(admissionFee);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getAdmission_fee()+""));
	            	 table.addCell(cell);
	            }
	            
	            PdfPCell slNo4 = new PdfPCell(new Paragraph("4"));
	            PdfPCell examFee = new PdfPCell(new Paragraph("Examination Fee"));
	            table.addCell(slNo4);
	            table.addCell(examFee);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getExam_fee()+""));
	            	 table.addCell(cell);
	            }
	            
	            
	            PdfPCell slNo5 = new PdfPCell(new Paragraph("5"));
	            PdfPCell tuitionFe = new PdfPCell(new Paragraph("Full Course Tuition Fee"));
	            table.addCell(slNo5);
	            table.addCell(tuitionFe);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getTution_fee()+""));
	            	 table.addCell(cell);
	            }
	            
	            PdfPCell slNo6 = new PdfPCell(new Paragraph("6"));
	            		
	            PdfPCell devlpmnt = new PdfPCell(new Paragraph("Development Charge"));
	            table.addCell(slNo6);
	            table.addCell(devlpmnt);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getDevelopment_fee()+""));
	            	 table.addCell(cell);
	            }
	            
	            
	            
	            PdfPCell slNo7 = new PdfPCell(new Paragraph("7"));
        		
	            PdfPCell misc = new PdfPCell(new Paragraph("Miscellaneous Charge "));
	            table.addCell(slNo7);
	            table.addCell(misc);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getMisc_fee()+""));
	            	 table.addCell(cell);
	            }
	            
	            PdfPCell slNo8 = new PdfPCell(new Paragraph("8"));
        		
	            PdfPCell caution = new PdfPCell(new Paragraph("Caution Money"));
	            table.addCell(slNo8);
	            table.addCell(caution);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getCaution_money()+""));
	            	 table.addCell(cell);
	            }
	            
	            PdfPCell slNo9 = new PdfPCell(new Paragraph("9"));
        		
	            PdfPCell poorBoyFund = new PdfPCell(new Paragraph("Poor Boy Fund"));
	            table.addCell(slNo9);
	            table.addCell(poorBoyFund);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getPoor_boy_fund()+""));
	            	 table.addCell(cell);
	            }
	            
	            PdfPCell slNo10 = new PdfPCell(new Paragraph("10"));
        		
	            PdfPCell total = new PdfPCell(new Paragraph("Total"));
	            table.addCell(slNo10);
	            table.addCell(total);
	            
	            for(int i=0; i< feeStructureDtoList.size() ;i++ ){
	            	 PdfPCell cell = new PdfPCell(new Paragraph(feeStructureDtoList.get(i).getTotal_fee()+""));
	            	 table.addCell(cell);
	            }
	            
	            document.add(table);
	            Paragraph note1 = new Paragraph("There may be some changes above mentioned Fee.");
	            note1.setSpacingBefore(10);
	            document.add(note1);
	            Paragraph note2 = new Paragraph("60% of caution money will be refunded within one year after result to those trainee who have completed successfully training. In any other cases full caution money will be forfeited.");
	            document.add(note2);
	            
	    	    Paragraph signature = new Paragraph("                                                       																																										Authorized Singnatory ");
	            signature.setSpacingBefore(20);
	            document.add(signature);
	            document.close();
	        } catch(Exception e){
	        	e.printStackTrace();
	        }


			
		}else{
			//throw exception that for given trade and session feestructure doesnot exist
		}
				return fileName;

	
	}
}
