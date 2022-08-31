/*
 *  Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. Create an object of the Box class and test the functionalities.
 */
package Classes_and_Objects.Assignment1;

public class Box {
	
	private static double width;
	private static double height;
	private static double depth;

	public Box(double d, double e, double f) {
		super();
		this.width = d;
		this.height = e;
		this.depth = f;
	}
	
	public static double Volume(Box box) {
		return width*height*depth;
	}
	
	public static void main(String[] args) {
		
		Box box = new Box(2.5, 3.4, 6.5);
		
		System.out.println(Volume(box));
	}

}
