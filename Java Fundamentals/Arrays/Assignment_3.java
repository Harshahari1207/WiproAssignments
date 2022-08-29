
/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.
If the number is not found, it will print -1 else it will print the index value of the given  number in the array.
Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.
Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/
import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[] = { 2,5,9,8,7,3};
		int index = -1;
		System.out.print("Enter the number to be searched: ");
		int x = s.nextInt();
		for(int i=0; i<a.length; i++) {
			if(a[i] == x) {
				index = i+1;
			}
			
		}
		System.out.print( +index);
	    

	}

}
