package Assignment1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the Elements of the array: ");
		try {
		for(int i=0; i<n;i++) {
			a[i] = s.nextInt();
		}
		
		System.out.print("Enter index of the element to be searched: ");
		int x = s.nextInt();			
				System.out.println("the array element at " +x+ " = "+a[x]);
				System.out.print("The array element successfully accessed");
		}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.print("java.lang.ArrayIndexOutOfBoundsException");
				
			}catch(InputMismatchException ae) {
				System.out.print("java.util.InputMismatchException");
			}
		s.close();
		}

	}


