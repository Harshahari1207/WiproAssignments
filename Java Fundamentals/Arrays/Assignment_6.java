//Write a program to initialize an array and print them in a sorted order.
import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int temp = 0;
		System.out.print("Enter Size: ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0; i<n; i++) {
		    a[i] = s.nextInt();
		    
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Elements of array sorted in ascending order:");
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
