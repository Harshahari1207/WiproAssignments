package Steam_API;

import java.util.ArrayList;

class Student{
	private int rollNo;
	private String name;
	private float mark;
	public Student(int rollNo, String name, float mark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}
	
	float getMark() {
		return mark;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mark=" + mark + "]";
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(24,"Harsha",90));
		list.add(new Student(2,"Anil",98));
		list.add(new Student(12,"Hari",96));
		list.add(new Student(26,"Suresh",35));
		list.add(new Student(32,"Amar",93));
		list.add(new Student(1,"Somesh",49));
		long count = list.stream().filter(s -> s.getMark() >= 50).count();
		System.out.println(count);

	}

}
