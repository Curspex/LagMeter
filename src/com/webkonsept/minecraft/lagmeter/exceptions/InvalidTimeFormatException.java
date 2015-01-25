package com.webkonsept.minecraft.lagmeter.exceptions;

public class InvalidTimeFormatException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTimeFormatException(){
		this("An uptime command has an invalid format. Please fix your configuration.");
	}

	public InvalidTimeFormatException(final String message){
		super(message);
	}
}