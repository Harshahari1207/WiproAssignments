package Function_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 9, 24,36,72,49,84, 81, 51));
		
		Predicate<Integer> p = i -> ((Math.sqrt(i) - Math.floor(Math.sqrt(i))) == 0) ? true : false;
		ArrayList<Integer> res = new ArrayList<>();
		
		list.forEach(
				i -> {
					if(p.test(i))res.add(i);
				});
		System.out.println(res);
	}

}
