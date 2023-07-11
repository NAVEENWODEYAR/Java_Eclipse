package com.bookstore.service.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailSenderService
{
	// injecting the JMS object
	@Autowired
	JavaMailSender mailSender1;
	
	public void sendMail(String toMail, String subject, String body)
	{
		// SimpleMailMessage class
		SimpleMailMessage messge = new SimpleMailMessage();
							messge.setFrom("naveenkrishnawodeyar@gmail.com");
							messge.setTo(toMail);
							messge.setSubject(subject);
							messge.setText(body);
							
							mailSender1.send(messge);
							System.out.println("Book aded to the database successfully..,");
	}

}
