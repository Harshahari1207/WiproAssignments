
/*Write a program to remove the duplicate elements in an array and print the same.
Example)
I/P:{12,34,12,45,67,89}
O/P:{12,34,45,67,89}
*/
import java.util.Scanner;

public class Assignment_7 {
	
	  
       
    public static void main (String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter the size: ");
    	int n = s.nextInt();
    	System.out.print("Enter the elements: ");
    	int arr[] = new int[n];
    	for(int i=0; i<n; i++) {
    		arr[i] = s.nextInt();
    	}
    	
    	int index = 0;
        int flag = 0, count;
        int[] temp = new int[n];  
          int i,j;
        for ( i=0; i<n; i++){
        	count = 0;
        	for(j = i+1; j<n; j++) {
            if (arr[i] == arr[j]){  
                count = count+1;
                break;
            }
           }
        	if(count == 0) {
        		temp[index] = arr[i];
        		index++;
        	}
         }  
        for(i=0; i<index; i++) {
        	arr[i] = temp[i];
        }
         
        System.out.print("After removing duplicates: ") ; 
        for ( i=0; i<index; i++) {  
           System.out.print(arr[i]+" ");
        }
    }  
}  