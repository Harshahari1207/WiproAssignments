package inheritance.Assignment1;

public class Bird extends Animal{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("Bird Eats");
	}

	@Override
	void Sleep() {
		// TODO Auto-generated method stub
		super.Sleep();
		System.out.println("Bird Sleep");
	}
	void fly() {
		System.out.println("Bird fly");
	}
	

}
