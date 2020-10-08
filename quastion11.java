package assignment_5;

public class quastion11 {

	public static void main(String[] args) {
		
	/*
	 * Question-11:

Print the following output using nested for loops.

4       3       2      1

     3       2      1

         2       1

              1
	 * 
	 * 
	 * 
	 * 
	 */
		int rows=4;


		for(int i=1;i<=rows;i++) {

			for(int j=4;j>=i;j--) {

				System.out.print("  "+j);

			}
			System.out.println(" ");

			}

	}

}
