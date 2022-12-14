package List.Assignment2;

import java.util.ArrayList;
import java.util.List;

class MyArrayList<E> extends ArrayList<E>{
	public boolean add(E e) {
		if(e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		}else {
			throw new ClassCastException("Only Integer, Float and Double are Supported.");
		}
	}
}

public class Assignment_2 {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		try {
			list.add(15);
			list.add(1.2F);
			list.add(3.1456);
			list.add("Test");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
		

	}

}
