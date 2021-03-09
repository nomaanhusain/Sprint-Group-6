package com.healthCare.exception;

public class ApointmentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ApointmentNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ApointmentNotFoundException(String msg)
	{
		super(msg);
	}
}
