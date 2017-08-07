
public class Overloading {
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		number(5000000);
		country(90.50);
		
		
	}

	public static void number(int i) { // Function
		System.out.println(i); //Action
		
	}
	
	
	
	public static void number(long u) {
		
		System.out.println(u);
		
	}
	//Overloading function are two different function with the same name but different argument. 
	
	public static void country(int y) {
		System.out.println(y);
	}
	public static void country(double u){
		
		System.out.println(u);
		
	}
	
	
}
