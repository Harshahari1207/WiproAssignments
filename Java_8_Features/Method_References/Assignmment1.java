package Method_References;

import For_Each.Assignment1;

interface FactReference {
	int fact(int n);
}

public class Assignmment1 {
	
	int factorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignmment1 obj = new Assignmment1();
		FactReference ref = obj :: factorial;
		System.out.println(ref.fact(5));
		System.out.println(ref.fact(8));
	}

}
