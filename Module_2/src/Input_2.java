import java.util.Scanner;

public class Input_2 { //How can I input 2 numbers in Java and divide by 0 ?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner reader=new Scanner(System.in);//Scanner object
		System.out.println("Add your number");
		int n= reader.nextInt();// reading the input
		System.out.println("put one more number");
		int p=reader.nextInt();
		int sum=n+p;
		System.out.println("your number is " + sum);*/
		
		
		Scanner reader=new Scanner(System.in);//Scanner object
		System.out.println("What is your number?");
		int n= reader.nextInt();// reading the input
		System.out.println("What is your 2nd number?");
		int p=reader.nextInt();
		System.out.println("Answer of the division is");
		int divide=p/n;
		System.out.println(divide);
		
		
		
		
		
		
		

	}

}
