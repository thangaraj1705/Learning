package com.mailsender.service;


import com.mailsender.entity.Mail;

public interface MailService {
	
	public void sendMail(Mail mail);
	
	public void prodReport();

}
