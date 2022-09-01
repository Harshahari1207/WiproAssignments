package Assignment2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment_2 {

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the input file name: ");
		String inputFileName = s.nextLine();
		System.out.print("Enter the output file name: ");
		String outputFileName = s.nextLine();
		
		File filein = new File(inputFileName);
		File fileout = new File(outputFileName);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while((ch = br.read()) != -1) {
			bw.write(ch);
		};
		
		System.out.print("File Copied Successfully");
		
		br.close();
		bw.close();
		s.close();
	}

}
