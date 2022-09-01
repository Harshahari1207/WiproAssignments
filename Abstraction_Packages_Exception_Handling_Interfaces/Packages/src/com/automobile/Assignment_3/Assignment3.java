package com.automobile.Assignment_3;

import com.automobile.Honda;
import com.automobile.twowheeler.Hero;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Class 324", "AD24K1234", "Amar", 96);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Classy City", "AD42G1234", "Anil", 86);
		honda.getModelName();
		honda.getownerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();

	}

}
