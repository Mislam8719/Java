
public class Local_Global {

  	static int x=600; // Global variable can be called in different function and with extend statement you can called in different classes.
  	static int t=500;
  	static int g=700;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello();
		name();
		
	}
	
	
	
	
	public static void Hello() {
		
				
		int a=100;      // local variable. You can use local variable for a specific function only
		int c=400;
		
		System.out.println(a);  		// local variable.
		System.out.println(x);  // Global variable
		System.out.println(t);  // Global variable
		System.out.println(c);         // local variable.
}
	public static void name() {
		
		int a=200;	// local variable.
		int c=300;  // local variable.
		
		System.out.println(a);  	   // local variable.
		System.out.println(c); 		   // local variable.
		System.out.println(x);  // Global variable
		System.out.println(t);  // Global variable
	}
	
	
	
}
