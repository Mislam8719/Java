import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
try {		// Tries the specific code	
		Scanner reader=new Scanner(System.in);			//Scanner object with argument
		System.out.println("What is your number?");
		int n= reader.nextInt();						// reading the input
		System.out.println("What is your 2nd number?");
		int p=reader.nextInt();
		System.out.println("Answer of the division is");
		int divide=n/p;          						 // Dividing inputs
		System.out.println(divide);
} catch(Exception e) {       // Exception "e" is all kinds of exceptions OR try to catch all Exceptions

		System.out.println("Don't divide by '0' or any 'Words' ");
}	

	}


}