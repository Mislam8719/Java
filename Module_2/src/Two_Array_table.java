
public class Two_Array_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Rainbow table
		String Rainbow[]=new String[8];
	      
		Rainbow[0]="Yellow1";
		Rainbow[1]="Red1";
		Rainbow[2]="Black1";
		Rainbow[3]="Pink1";
		Rainbow[4] = "Green1";
		Rainbow[5] = "Orange1";
		Rainbow[6] = "White1";
		Rainbow[7] = "Indigo1";

		// colors table
		String colors[][] = new String[3][4];

		// First row
		colors[0][0] = "Green2";
		colors[0][1] = "Black2";
		colors[0][2] = "Pink2";
		colors[0][3] = "Orange2";

		// Second row
		colors[1][0] = "Yellow2";
		colors[1][1] = "Purple2";
		colors[1][2] = "Blue2";
		colors[1][3] = "White2";

		// Third row
		colors[2][0] = "Violet2";
		colors[2][1] = "Grey2";
		colors[2][2] = "Red2";
		colors[2][3] = "Royal Blue2";

		// Logic for printing Rainbow table
		/*
		 * for(int y=0; y<Rainbow.length;y++) System.out.println(Rainbow[y]);
		 * 
		 * System.out.println("**************************");
		 * 
		 * 
		 * //Logic for printing colors table int rows = colors.length; int cols =
		 * colors[0].length;
		 * 
		 * // Argument for rows for (int rownum = 0; rownum <rows; rownum++) { //
		 * Argument for Columns for (int colnum = 0; colnum <cols; colnum++) {
		 * 
		 * System.out.println(colors[rownum][colnum]);
		 * 
		 * // System.out.println(" "+colors[rownum][colnum]);
		 * 
		 * //printing something specific from colors table
		 * 
		 * //System.out.println(colors[1][1]); //System.out.println(colors[2][3]);
		 * 
		 * //printing something specific from Rainbow table
		 * 
		 * //System.out.println(Rainbow[0]); //System.out.println(Rainbow[1]);
		 */

		// print information from multiple tables:
		System.out.println(colors[1][0]);
		System.out.println(Rainbow[3]);
          
         

		
		
		
		
	    }	
		
		
	     
	     
		
		
	}



