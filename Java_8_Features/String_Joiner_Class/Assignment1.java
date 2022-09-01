package String_Joiner_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Harsha", "Amar", "Anil", "Sunil"));
		StringJoiner s = new StringJoiner(",", "{", "}");
		list.forEach(element -> s.add(element));
		System.out.println(s);

	}

}
