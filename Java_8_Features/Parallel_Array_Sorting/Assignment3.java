package Parallel_Array_Sorting;

import java.util.Arrays;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {5, 2, 4, 3, 1, 6, 7, 12, 24};
		System.out.print("Before sorting: " + Arrays.toString(array));
		Arrays.parallelSort(array, 0, 5);
		System.out.print("\nAfter sorting: " + Arrays.toString(array));

	}

}
