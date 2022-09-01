package Parallel_Array_Sorting;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2, 4, 5, 8, 9, 3, 1, 6, 7, 12, 24};
		System.out.println("Array: " + Arrays.toString(array));
		Arrays.parallelSort(array);
		System.out.println("\n Sum of max and min element: " + (array[0]+array[9]));

	}

}
