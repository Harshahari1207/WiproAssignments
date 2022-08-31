/*	
 Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)
*/
package Encapsulation_Abstraction.Assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book("Hari", new Author("Harsha", "xy@gmail.com", 'M'), 456.2, 5);
		
		System.out.println(book);
	}

}
