//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
import java.util.Scanner;

public class Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many numbers to be in the array: ");
		
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the numbers in the array: ");
		for(int i=0; i<a.length; i++) {
			a[i] = s.nextInt();
		}
		
		int large1,large2, small1, small2;
		large1 = small1 = a[0];
		large2 = small2 = a[1];
		if(large1 < large2) {
			int temp = large1;
			large1 = large2;
			large2 = temp;
		}
		for(int i=2; i<a.length; i++) {
			if(a[i] > large1) {
				large2 = large1;
				large1 = a[i];
			}
			else if(a[i] > large2 && a[i] != large1)
				large2 = a[i];
		}
		System.out.println("Two largest numbers in the array: "+large1+ ", " +large2);
		
		if(small1 > small2) {
			int temp = small1;
			small1 = small2;
			small2 = temp;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i] < small1) {
				small2 = small1;
				small1 = a[i];
			}
			else if(a[i] < small2 && a[i] != small1)
				small2 = a[i];
		}
		System.out.println("Two small numbers int he array; " +small1+ ", "+small2);
		

	}

}
