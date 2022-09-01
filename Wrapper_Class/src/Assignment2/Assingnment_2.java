package Assignment2;

import java.util.Scanner;

public class Assingnment_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		System.out.println("Given Number: " +num);
		System.out.println("Binary equa=ivalent: " +Integer.toBinaryString(num));
		System.out.println("Octal equivalent: " +Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent: " +Integer.toHexString(num));

	}

}
