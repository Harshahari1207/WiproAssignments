package com.wipro.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String street;
	@Column(nullable=false, length=50)
	private String City;
	@Column(nullable=false, length=50)
	private String state;
	@Column(nullable=false, length=10)
	private String pincode;
	public Address() {
		super();
	}
	public Address(String street, String city, String state, String pincode) {
		super();
		this.street = street;
		City = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", City=" + City + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	

}
