package com.wipro;

import org.springframework.stereotype.Component;

@Component
public class Hard_disk {
	
	private String hdname;

	public String getHdname() {
		return hdname;
	}

	public void setHdname(String hdname) {
		this.hdname = hdname;
	}

	@Override
	public String toString() {
		return "Hard_disk [hdname=" + hdname + "]";
	}
	
	public void display() {
		System.out.println("Samsung Hard disk!");
	}

}
