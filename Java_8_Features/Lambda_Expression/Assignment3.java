package Lambda_Expression;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<String>(Arrays.asList("Hari", "Amar", "Anil", "Sunil", "Mouna", "Charry", "Raj", "Gopi", "Manju", "Appi"));
		
		
		al.forEach(word -> System.out.print((((String) word).length() % 2 != 0)? word + " " : ""));

	}

}
