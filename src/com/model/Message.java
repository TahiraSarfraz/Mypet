package com.model;

public class Message {
	
	private String message = "This should generate a json";
	private String hardCodedMessage = "This is also a hard-coded message.";

	public Message(){}
	
	public Message(final String message) {
		this.message = message;
	}

	public String getHardCodedMessage() {
		return hardCodedMessage;
	}

	public void setHardCodedMessage(final String hardCodedMessage) {
		this.hardCodedMessage = hardCodedMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}
}