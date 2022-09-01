package Lambda_Expression;

public class Assignment4 {
	
	interface WordCount{
		int count(String str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount wc = str ->{
			return (str.split(" ").length);
		};
		System.out.println(wc.count("Iam proud of my country"));

	}

}
