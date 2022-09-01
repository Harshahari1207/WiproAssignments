package Opional_Class;

import java.util.Optional;

public class Assingment2 {
	String address;
	String default_address = "India";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assingment2 obj = new Assingment2();
		Optional<String> n = Optional.ofNullable(obj.address);
		
		System.out.println(n.orElse(obj.default_address));
	}

}