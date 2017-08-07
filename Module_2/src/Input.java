import java.util.Scanner;

public class Input {    //How can I input name/number in Java?


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);//Scanner object
		
		System.out.println("What is your Name?");// For String
		String s=reader.next();
		
		System.out.println("Add your number"); // For integer
		int n= reader.nextInt();// reading the input
		
		System.out.println("put one more number");
		int p=reader.nextInt();
		int sum=n+p;
		System.out.println("your number is " + sum);// Adding numbers
		
		System.out.println("The result for division is");//Dividing numbers
		int divide=n/p;
		System.out.println(divide);
		
		
	}

}
