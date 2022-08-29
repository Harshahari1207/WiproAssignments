//Write a program to initialize an integer array and print the sum and average of the array.
import java.util.Scanner;

public class Assignment_1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, sum = 0;
		float average;
		System.out.print("Enter size ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the numbers in the array: ");
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
			sum = sum+a[i];
		}
		System.out.println("Sum = "+sum);
		average = sum/n;
		System.out.println("Average = "+average);
	}

}
