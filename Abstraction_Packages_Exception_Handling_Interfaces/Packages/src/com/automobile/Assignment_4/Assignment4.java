package com.automobile.Assignment_4;

import com.automobile.Ford;
import com.automobile.Fourwheeler.Logan;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logan logan = new Logan("Logan BLR", "BF34H3456", "MOUNA", 240, 1);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		logan.Speed();
		System.out.println("Has Gps? " +logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Ford 14", "DR24J135", "Rajani", 400, 1);
		ford.getModelName();
		ford.getOwnerName();
		ford.getRegistrationNumber();
		ford.speed();
		System.out.println("Has AC? "+ford.tempControl());

	}

}
