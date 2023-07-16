package com.oignon.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailService 
{
	//DI.,
	@Autowired
	JavaMailSender mailSender;
	
		public void sendMail(String toUser, String body, String subject)
		{
			SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
								simpleMailMessage.setFrom("naveenkrishnawodeyar@gmail.com");
								simpleMailMessage.setTo(toUser);
								simpleMailMessage.setText(body);
								simpleMailMessage.setSubject(subject);
								
								mailSender.send(simpleMailMessage);
								System.out.println("Mail sent to the user.,");
		}

}
