/*
 *  Create a class named ‘Animal’ which includes methods like eat() and sleep().

Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().

Create an instance of Animal class and invoke the eat and sleep methods using this object.

Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
 */

package inheritance.Assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		animal.eat();
		Bird bird = new Bird();
		bird.Sleep();
		Bird bird2 = new Bird();
		bird2.eat();
		bird.fly();

	}

}
