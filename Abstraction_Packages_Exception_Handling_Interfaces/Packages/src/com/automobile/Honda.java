package com.automobile;

public  class Honda extends vehicle{
	private String modelName;
	private  String registrationNumber;
	private String ownerName;
	private int speed;
	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}
	public void getModelName() {
		System.out.println("ModelName: "+modelName);
	}
	public void getRegistrationNumber() {
		System.out.println("RegistrationNumber: " +registrationNumber);
	}
	public void getownerName() {
		System.out.println("OwnerName: "+ownerName);
	}
	public int getSpeed() {
		return speed;
	}
	public void cdplayer() {
		System.out.print("Accessing CD player.");
	}
	@Override
	public void getOwnerNumbeer() {
		// TODO Auto-generated method stub
		
	}

}
