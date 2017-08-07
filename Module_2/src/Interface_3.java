
public class Interface_3  {


	public void morning() {
		
		System.out.println("cloudy morning");

	}


	public void afternoon() {
		
		 System.out.println("Sunny afternoon");
	}


	public void lunch() {
		
		 System.out.println("Tasty salmon");
	}

	public static void main(String[] args) {
		
		
		 Interface_3 x=new Interface_3();
		{
			x.afternoon();
			x.morning();
			x.lunch();
		}

	}

}
