package com.wipro.service;

import com.wipro.bean.Flower;
import com.wipro.dao.FlowerDAO;

public class DisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowerDAO fldao = new FlowerDAO();
		Flower flobj = fldao.getFlower("2");
		System.out.println(flobj);

	}

}
