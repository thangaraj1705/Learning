package com.mailsender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mailsender.entity.Mail;
import com.mailsender.service.MailService;

@RestController
@RequestMapping("/api/mail")
public class MailController {

	@Autowired
	private MailService mailService;


	@PostMapping(path="/send")
	public ResponseEntity<String> sendMail (@RequestBody Mail mail){

		try {
		mailService.sendMail(mail);

		return ResponseEntity.ok("Mail Send Successfully");
		}
		catch(Exception e) {
			return ResponseEntity.status(500).body("Error send Mail "+e.getMessage());
		}
	}
		@GetMapping(path="/report")
		public ResponseEntity<String> monitoring (){

			try {
			mailService.prodReport();

			return ResponseEntity.ok("Mail Send Successfully");
			}
			catch(Exception e) {
				return ResponseEntity.status(500).body("Error send Mail "+e.getMessage());
			}

	}


}
