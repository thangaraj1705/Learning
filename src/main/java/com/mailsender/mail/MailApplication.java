package com.mailsender.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mailsender.entity.Mail;
import com.mailsender.service.MailService;

@SpringBootApplication(scanBasePackages = "com.mailsender")
public class MailApplication {

	/*
	 * @Autowired private MailService mailService;
	 */

	public static void main(String[] args) {
		SpringApplication.run(MailApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * 
	 * Mail mail = new Mail(); mail.setMailFrom("bruceleeraj17@gmail.com");
	 * mail.setMailTo("raj1751999@gmail.com");
	 * mail.setMailSubject("Spring Boot - Email demo");
	 * mail.setMailContent("Just testing"); mailService.sendMail(mail);
	 * 
	 * 
	 * }
	 */

}
