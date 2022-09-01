package Function_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,3));
		
		Function<ArrayList<Integer>, Integer> func = all ->{
			int sum = 0;
			for(int elements : all) {
				sum += elements;
			}
			return sum;
		};
		System.out.println(func.apply(list));

	}

}
