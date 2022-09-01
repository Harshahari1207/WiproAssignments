package com.automobile.Fourwheeler;

import com.automobile.vehicle;

public class Logan extends vehicle{
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int gps;
	
	
	public Logan(String modelName, String registrationNumber, String ownerName, int speed, int gps) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps = gps;
	}
	
	public void getModelName() {
		System.out.println("ModelName: "+modelName);
	}
	public void getRegistrationNumber() {
		System.out.println("RegistraionNumber: "+registrationNumber);
	}
	public void getOwnerName() {
		System.out.println("OwnerName: "+ownerName);
	}
	public int Speed() {
		return speed;
	}
	public int gps() {
		return gps;
	}

	@Override
	public void getOwnerNumbeer() {
		// TODO Auto-generated method stub
		
	}

}
