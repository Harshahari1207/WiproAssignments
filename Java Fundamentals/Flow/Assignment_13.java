/*
 *  Write a program to print prime numbers between 10 and 99.
 */

import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i=0;
		int num=0;
		String prime = "";
		for(i=10; i<100; i++) {
			int counter=0;
			for(num=i; num>=1; num--) {
				if(i%num == 0) {
					counter = counter+1;
				}
			}
			if(counter == 2) {
				prime = prime + i + " ";
			}
		}
		System.out.println("Prime numbers from 10 to 99 are : ");
		System.out.println(prime);

	}

}
