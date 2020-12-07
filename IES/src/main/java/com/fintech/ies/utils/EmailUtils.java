package com.fintech.ies.utils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
@Component
public class EmailUtils {

	@Autowired
	private JavaMailSender javaMailSender;

	public boolean sendEmail(String to, String subject, String body)  {
		boolean isSent = false;
		

		// true = multipart message
		
		try {
			MimeMessage msg = javaMailSender.createMimeMessage();
			MimeMessageHelper 	helper = new MimeMessageHelper(msg, true);
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(body, true);
			 javaMailSender.send(msg);
			 isSent= true;
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return isSent;    

	}

}
