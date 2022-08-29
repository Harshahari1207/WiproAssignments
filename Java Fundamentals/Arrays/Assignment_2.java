//Write a program to initialize an integer array and find the maximum and minimum value of the array.
import java.util.Scanner;

public class Assignment_2 {
	
	;

	static int maxar(int[] a) {
		int maxi = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > maxi) {
				maxi = a[i];
			}				
		}
		return maxi;
	}
	
	
	static int minar(int[] a) {
		int mini = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] < mini) {
				mini = a[i];
			}
		}
		return mini;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("Enter size ");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the numbers in the array: ");
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
			
		}
		
		int maxi = maxar(a);
		System.out.println("Maximum of th array " +maxi);
		int mini = minar(a);
		System.out.println("Minimum of th array " +mini);
	}

}
