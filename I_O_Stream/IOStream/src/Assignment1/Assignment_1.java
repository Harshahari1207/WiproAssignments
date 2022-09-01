package Assignment1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Assignment_1 {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the file Name: ");
		String fileName = s.nextLine();
		System.out.print("Enter the Character to be counted: ");
		char c1 = s.nextLine().charAt(0);
		
		File file = new File (fileName);
		int charCount = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		
		int ch;
		do {
			ch = br.read();
			if(ch >= 65 && ch <= 90) ch +=32;
			if(c1 >= 65 && c1 <= 90) c1 += 32;
			
			if(ch == c1)
				charCount++;
		}while(ch != -1);
		
		System.out.println("File " +fileName+ " has " +charCount+  " instance of letter " +c1+ ".");
		br.close();
		s.close();

	}

}
