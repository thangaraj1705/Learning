package com.mailsender.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="mail")
@Entity
public class Mail 
{
	@Id
	@Column(name="mail_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="mail_from")
	private String mailFrom;

	@Column(name="mail_to")
	private String mailTo;

	@Column(name="mail_subject")
	private String mailSubject;

	@Column(name="mail_content")
	private String mailContent;


	public Mail() {
		super();
	}
	public Mail(long id, String mailFrom, String mailTo, String mailSubject, String mailContent) {
		super();
		this.id = id;
		this.mailFrom = mailFrom;
		this.mailTo = mailTo;
		this.mailSubject = mailSubject;
		this.mailContent = mailContent;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMailFrom() {
		return mailFrom;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getMailSubject() {
		return mailSubject;
	}
	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}
	public String getMailContent() {
		return mailContent;
	}
	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}
	@Override
	public String toString() {
		return "Mail [id=" + id + ", mailFrom=" + mailFrom + ", mailTo=" + mailTo + ", mailSubject=" + mailSubject
				+ ", mailContent=" + mailContent + "]";
	}



}

