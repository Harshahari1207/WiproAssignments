package Function_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lsit = new ArrayList<>(Arrays.asList(24, 5, 6, 9, 91, 37, 65, 6, 7));
		Consumer<ArrayList<Integer>> c = num -> num.forEach(
				i -> System.out.println(i + (i%2 == 0 ?" even":" odd")));
		c.accept(lsit);

	}

}
