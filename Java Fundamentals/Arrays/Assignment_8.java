
/*Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/
import java.util.Scanner;

public class Assignment_8 {
	
	static void cndsum(int arr[], int a, int b) {
		int sum=0;
		boolean add = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != a && add == true)
				sum = sum+arr[i];
			else if(arr[i] == a)
				add = false;
			else if(arr[i] == b)
				add = true;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size: ");
		int n = s.nextInt();
		System.out.print("Enter the elements: ");
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		
		cndsum(a, 6,7);

	}

}
