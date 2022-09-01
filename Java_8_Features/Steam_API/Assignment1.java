package Steam_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,-4,2,6,-8,-2,3));
		ArrayList<Integer> res = (ArrayList<Integer>) list.stream().filter(x -> (x < 0 && x % 2 == 0)).collect(Collectors.toList());
		System.out.println(res);
		

	}

}
