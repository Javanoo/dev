package com.javanoo.dev.model;

import org.springframework.data.annotation.Id;

public class Email {

	@Id
	private Integer emailId;
	private String emailAddress;
	private String emailSubject;
	private String emailMessage;
	
	public Email() {
		setEmailAddress("unknown");
		setEmailSubject("unknown");
		setEmailMessage("nothing");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}
	
}