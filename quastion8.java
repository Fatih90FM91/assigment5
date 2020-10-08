package assignment_5;

public class quastion8 {

	public static void main(String[] args) {

		/*
		 * Question-8:
		 * 
		 * Write a program to calculate the sum of the numbers from 1 till upper bound.
		 * If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15. If upper bound is
		 * 11, sum should be 1 + 2 + ... + 11 = 66. If upper bound is 100, sum should be
		 * 1 + 2 + ... + 100 = 5050.
		 * 
		 * You should use a while loop.
		 * 
		 * 
		 * 
		 */
		int i = 0;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;

		while (i < 100) {
			i++;
			if (i <= 5) {

				sum = sum + i;

			}

			if (i <= 11) {

				sum1 = sum1 + i;

			}
			if (i <= 100) {

				sum2 = sum2 + i;
			}

		}
		System.out.println("1+2+3+4+5 = " +sum);
		System.out.println("1+2+3+4+5....11 = "+sum1);
		System.out.println("1+2+3+4+5....100 = "+sum2);
	}

}
