package Function_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Assignment6 {
	
	static String revString(String str) {
		StringBuffer sbr = new StringBuffer();
		sbr.append(str);
		return sbr.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Aresh", "amma", "sos", "amar", "abcba", "run", "boost", "rar", "Anil", "non"));
		ArrayList<String> revWords = new ArrayList<>();
		Consumer<String> rev = str -> revWords.add(revString(str));
		list.forEach(str -> rev.accept(str));
		list = revWords;
		list.forEach(System.out :: println);

	}

}
