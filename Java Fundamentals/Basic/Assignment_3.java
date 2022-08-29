import java.util.Scanner;

public class Assignment_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the to numers to add: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a+b;
		System.out.printf("Sum of %d and %d is %d", a,b,c);
	}

}
