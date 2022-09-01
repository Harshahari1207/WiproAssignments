package Assignment2;
public class Assignment_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = args.length;
		
		for (int i = 0; i < n; i++)
			if (args[i].charAt(args[i].length() - 1) == ',') 
				args[i] = args[i].replace(",", "");
		int a[] = new int[n];
		int sum = 0;
		double avg = 0;
		
		try {
			for(int i=0; i<n; i++)
				a[i] = Integer.parseInt(args[i]);
			
			for(int i=0; i<n; i++)
				sum += a[i];
			avg = sum/n;
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}catch(ArithmeticException e) {
			System.out.println("InputMismatchExcepyon");
		}
		
		System.out.println("sum: " +sum);
		System.out.println("avg: " +avg);

	}

}
