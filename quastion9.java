package assignment_5;

public class quastion9 {

	public static void main(String[] args) {
		
		/*Question-9:

Write a program for the following logic:
Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if-else statements.
 Note that, there should not be any comma after the last digit.
		 * 
		 * 
		 * 
		 */
		
		int i =0;
		
		while(i<20) {
			i++;
			if(i%2!=0) {
				if(i<=10) {
					System.out.println("if end=10  OUTPUT =,"+i);
				} if(i<=11) {
					System.out.println("if end=11 OUTPUT =,"+i);
				}
			}
		
		}

	}

}
