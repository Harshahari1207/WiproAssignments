package com.automobile.twowheeler;

import com.automobile.vehicle;

public class Hero extends vehicle{
	
	private String modelName;
	private String  registrationNumber;
	private String ownerName;
	private int speed;
	
	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}
	
	public void getModelName() {
		System.out.println("ModelName: " +modelName);
	}
	public void getRegistrationNumber() {
		System.out.println("RegistrationNumber: " +registrationNumber);
	}
	public void getOwnerName() {
		System.out.println("OwnerName: " +ownerName);
	}
	
	public int getSpeed() {
		return speed;
	}
	public void radio() {
		System.out.println("Accessing the Radio");
	}

	@Override
	public void getOwnerNumbeer() {
		// TODO Auto-generated method stub
		
	}

}
