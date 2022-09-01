package String_Joiner_Class;

import java.util.StringJoiner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Harsha");
		s1.add("Dhoni");
		s1.add("ABD");
		
		StringJoiner s2 = new StringJoiner("-");
		s2.add("Blr");
		s2.add("Hyd");
		s2.add("Pune");
		
		System.out.println(s1.merge(s2));
		System.out.println(s2.merge(s1));

	}

}
