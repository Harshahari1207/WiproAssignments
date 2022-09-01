package List.Assignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment_1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		
		printList(list);
		

	}
	public static void printList(List<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
