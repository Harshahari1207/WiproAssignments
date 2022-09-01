package For_Each;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Mondy", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
		al.forEach(day -> System.out.println(day));

	}

}
