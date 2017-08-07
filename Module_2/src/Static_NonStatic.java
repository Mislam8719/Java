
public class Static_NonStatic {
	
	static int i=700;

	public static void main(String[] args) { //1)Static main function only call static function, non static is not allowed
											//2) Non static main function can only take non static function	
											//3) If we want to call non-static function in a static main function
		// TODO Auto-generated method stub
	
		car();
		number();
		Static_NonStatic T=new 	Static_NonStatic();// y is a variable
		T.food(); 		//Question???
		
		//Creating an Object for (car2) non-static function
		Static_NonStatic model=new 	Static_NonStatic();  //instance for an object
		model.car2(); // now calling car2 function
		
		Static_NonStatic x=new 	Static_NonStatic();// X is a variable
		x.car3(); // now calling car3 function
		
		Static_NonStatic y=new 	Static_NonStatic();// y is a variable
		y.food(); 		//Question???
		

	}

	

	public static void car() {  //static function
		System.out.println("Mercedez");
	
		
	}
	public void car2() {		//non static function
		System.out.println("Tesla");
		
		
	}
	public void car3() {		//non static function
		System.out.println("Toyota");
		
	}
	public static void number() {		//static function
		System.out.println(i);
		
	}
	public void food(){
		System.out.println("I love Salmon");
	}
	
	}
		
	
	
	
	
	
	

