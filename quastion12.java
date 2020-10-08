package assignment_5;

public class quastion12 {

	public static void main(String[] args) {
		/*
		 * Question-12:
		 * 
		 * Print following output using nested for loops. 1 2 3 4 5 6 7 8 9 10 2 4 6 8
		 * 10 12 14 16 18 20 3 6 9 12 15 18 21 24 27 30 4 8 12 16 20 24 28 32 36 40 5 10
		 * 15 20 25 30 35 40 45 50 6 12 18 24 30 36 42 48 54 60 7 14 21 28 35 42 49 56
		 * 63 70 8 16 24 32 40 48 56 64 72 80 9 18 27 36 45 54 63 72 81 90 10 20 30 40
		 * 50 60 70 80 90 100
		 * 
		 * NOTE: 1. 1st row is table of 1, 2nd row is table of 2 and so on. 2. You can
		 * use space between the digits on the same row.
		 * 
		 * 
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.print(" "+i);

		}System.out.println();
		for(int j  =1;j<=20;j++) {
			if(j%2==0) {
				System.out.print(" "+j);
			}
		}System.out.println();
		for(int k=1;k<=30;k++) {
			if(k%3==0) {
				System.out.print(" "+k);
			}
			
		}System.out.println();
		for(int l=1;l<=40;l++) {
			if(l%4==0) {
				System.out.print(" "+l);
			}
			
		}System.out.println();
		for(int a=1;a<=50;a++) {
			if(a%5==0) {
				System.out.print(" "+a);
			}
			
		}System.out.println();
		for(int b=1;b<=60;b++) {
			if(b%6==0) {
				System.out.print(" "+b);
			}
			
		}System.out.println();
		for(int x=1;x<=70;x++) {
			if(x%7==0) {
				System.out.print(" "+x);
			}
			
		}System.out.println();
		for(int y=1;y<=80;y++) {
			if(y%8==0) {
				System.out.print(" "+y);
			}
			
		}System.out.println();
		for(int c=1;c<=90;c++) {
			if(c%9==0) {
				System.out.print(" "+c);
			}
			
		}System.out.println();
		for(int m=1;m<=100;m++) {
			if(m%10==0) {
				System.out.print(" "+m);
			}
			
		}System.out.println();
	}

}
