package Lambda_Expression;

import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		String[] words = {"Hari", "Amar", "Anil", "Sunil", "Mouna", "Charry", "Raj", "Gopi", "Manju", "Appi"};
		for(String word : words) {
			StringBuffer sb = new StringBuffer(word);
			al.add(sb);
		}
		al.forEach(word -> System.out.print(((StringBuffer) word).reverse() + " "));

	}

}
