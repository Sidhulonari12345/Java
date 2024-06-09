package com.Child.ChildWelfareJavaProject.emailServce;

import java.util.Properties;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;


import javax.mail.Message;
import javax.mail.internet.InternetAddress;




@Service
public class EmailNewService {
	
//	public void sendnewemail(String subject,String massage, String to) {
//		
////		rest of the code
//		
//		String host= "smtp.gmail.com";
//		
//	Properties properties =	System.getProperties();
//		
//		System.out.println("Properties :"+properties);
//		
//		properties.put("mail.smtp.host", host);
//		properties.put("mail.smtp.port", "465");
//		properties.put("mail.smtp.ssl.enable", "true");
//		properties.put("mail.smtp.auth", "true");
//		
////		step1
//		 Session session =Session.getInstance(properties,new Authenticator(){
//
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				
//				return new PasswordAuthentication("siddeshlonari01@gmail.com", "*****");
//			}
//			
//			
//		});
////		step 2 compose massage
//		 
//		 session.setDebug(true);
//		 
//		 
//		MimeMessage m = new MimeMessage(session);
//		
//
//		try {
////			from email
//			m.setFrom();
////			adding recipient to massage
//			m.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
////			ADDION SUBJECT TO MASSAGE
//			m.setSubject(subject);
//			
//
//				
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		 
//	}

}
