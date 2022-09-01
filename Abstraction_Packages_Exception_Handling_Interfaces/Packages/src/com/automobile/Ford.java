package com.automobile;

public  class Ford extends vehicle{
	
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int tempControl;
	public Ford(String modelName, String registrationNumber, String ownerName, int Speeed, int tempcontrol) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.tempControl = tempcontrol;
	}
	
	public void getModelName()
	
	{
		System.out.println("ModelName: "+modelName);
	}
	
	public void getRegistrationNumber() {
		System.out.println("RegistrationNumber: "+registrationNumber);
	}
	public void getOwnerName() {
		System.out.println("Owner: "+ownerName);
	}
	public int speed() {
		return speed;
	}
	public int tempControl() {
		return tempControl;
	}

	@Override
	public void getOwnerNumbeer() {
		// TODO Auto-generated method stub
		
	}
	
}
