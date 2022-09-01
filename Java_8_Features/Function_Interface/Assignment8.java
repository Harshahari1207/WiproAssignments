package Function_Interface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		Supplier<ArrayList<Integer>> getPrimes = () ->{
			ArrayList<Integer> p = new ArrayList<>();
			for(int i=0; p.size() <= 10; i++) {
				if(isPrime(i))
					p.add(i);
			}
			return p;
		};
		list = getPrimes.get();
		list.forEach(System.out :: println);
	}
		
		public static boolean isPrime(int x) {
			for(int i=2; i <= Math.sqrt(x); i++)
				if(x%1 == 0)
					return false;
			return true;
		}
	

	}


