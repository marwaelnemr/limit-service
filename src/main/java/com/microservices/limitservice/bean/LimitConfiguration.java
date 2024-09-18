package com.microservices.limitservice.bean;

public class LimitConfiguration {
	private int minimum;
	private int maximum;
	
	
	
	
	
	protected LimitConfiguration() {
		super();
	}





	public LimitConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}





	public int getMinimum() {
		return minimum;
	}




	public int getMaximum() {
		return maximum;
	}

	
}
