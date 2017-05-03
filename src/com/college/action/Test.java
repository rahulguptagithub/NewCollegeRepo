package com.college.action;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;










import org.apache.commons.codec.binary.Base64;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.college.dao.ConnectionUtil;
import com.college.dao.SIDGenerator;
import com.college.persistence.AcademicRecords;
import com.college.persistence.AddressInfo;
import com.college.persistence.FeeStructure;
import com.college.persistence.Student;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
public class Test {
// added by rahul gupta
public static void main(String[] args) {//cmFtZXNoMTIzNA==
	byte[] encodedBytes = Base64.encodeBase64("ramesh12345".getBytes());
	System.out.println("encodedBytes " + new String(encodedBytes));
	
	/*byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
	System.out.println("decodedBytes " + new String(decodedBytes));
	//SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	//System.out.println(dateFormat.format(new Date()));
	//System.out.println( new java.sql.Date(dateFormat.format(new Date())));
	
	try {
        String recipient = "9880675358";
        String message = "Hello World";
        String username = "admin";
        String password = "abc123";
        String originator = "8506031645";

        String requestUrl  = "http://127.0.0.1:8080/api?action=sendmessage&" +
"username=" + URLEncoder.encode(username, "UTF-8") +
"&password=" + URLEncoder.encode(password, "UTF-8") +
"&recipient=" + URLEncoder.encode(recipient, "UTF-8") +
"&messagetype=SMS:TEXT" +
"&messagedata=" + URLEncoder.encode(message, "UTF-8") +
"&originator=" + URLEncoder.encode(originator, "UTF-8") +
"&serviceprovider=GSMModem1" +
"&responseformat=html";



        URL url = new URL(requestUrl);
        HttpURLConnection uc = (HttpURLConnection)url.openConnection();

        System.out.println(uc.getResponseMessage());

        uc.disconnect();

} catch(Exception ex) {
        System.out.println(ex.getMessage());

}*/
	
	/*s*/
	

	/*
	Document document = new Document();

    try {
        PdfWriter.getInstance(document,
                new FileOutputStream("Image.pdf"));
        document.open();

        Image image1 = Image.getInstance("C:\\Ramesh\\logo-image.jpg");
        document.add(image1);

        
            
        document.close();

    }catch(Exception e){
    	
    }*/
	
	//DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
	//print(dateFormat.format(new Date()); // will print like 2014-02-20
	//print(); // will print like 02-20-2014
	System.out.println("current Date"+dateFormat2.format(new Date()));

	//System.out.println("Report Date: " + new java.sql.Date(new Date().getTime()).toString());
	}


}
