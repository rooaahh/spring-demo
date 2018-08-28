package com.example.demomicroservice1;

public class HelloWorldResponse {

	public HelloWorldResponse() {
		super();
	}

	public HelloWorldResponse(int port, String text) {
		super();
		this.port = port;
		this.text = text;
	}

	private int port;
	
	private String text;

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
