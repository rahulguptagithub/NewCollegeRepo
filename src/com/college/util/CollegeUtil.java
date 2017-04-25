package com.college.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.college.dto.ForgotPasswordDto;
public class CollegeUtil {
	
	public static boolean sendPassword(String pwd ,ForgotPasswordDto frgtPwdDto ){
		if(frgtPwdDto.getEmail() != null && frgtPwdDto.getMobileno()  != null){
			//TODO
			}else if(frgtPwdDto.getEmail() !=null){
				send(frgtPwdDto.getEmail(), pwd);
			}else if(frgtPwdDto.getMobileno() !=null){
				//TODO
			}else{
				//throw exception
			}
		return true;
	}
	
	 public static void send(String to,String pwd){  
		 	final String username = "";
			final String password = "";
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.port", "587");
			Session session = Session.getInstance(props,
			  new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			  });

			try {
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("mtpjpl@gmail.com"));
				message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));
				message.setSubject("Password Recovery Mail");
				message.setText("Dear User Your Password is \t" + EncodingUtil.decryptPassword(pwd));
				Transport.send(message);
				System.out.println(" Mail set to Recepient \t" + to);
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
	 
	 }  
}
