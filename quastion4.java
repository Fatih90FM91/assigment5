package assignment_5;

import java.util.Scanner;

public class quastion4 {

	public static void main(String[] args) {
		
		//Question-4:

        //Write a while loop that lets the user enter a number. 
		///The number should be multiplied by 10, and the result stored in the variable product. 
		//The loop should iterate as long as product contains a value less than 100.
		
		Scanner scan=new Scanner(System.in);
		
		int i=scan.nextInt();
		
		while(i<100) {
			System.out.println(i);
			i=i*10;
			
		}
		System.out.println(i);

	}

}
