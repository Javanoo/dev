package com.javanoo.dev.model;

public class Email {
	private String emailAddress;
	private String emailSubject;
	private StringBuilder emailMessage;
	
	public Email() {
		setEmailAddress("unknown");
		setEmailSubject("unknown");
		setEmailMessage(new StringBuilder("nothing"));
	}
	
	public Email(String emailAddress, String subject, String message) {
		setEmailAddress(emailAddress);
		setEmailSubject(subject);
		setEmailMessage(new StringBuilder(message));
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

	public StringBuilder getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(StringBuilder emailMessage) {
		this.emailMessage = emailMessage;
	}
	
}