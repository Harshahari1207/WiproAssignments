package interfaces;

interface Test{
	int myFunction(int x, int y, int z);
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = (x, y, z) -> (x+y+z);
		Test t2 = (x, y, z) -> (x*y*z);
		
		System.out.println(t1.myFunction(10, 20, 40));
		System.out.println(t2.myFunction(20, 10, 50));
	}

}
