package assignment_5;

public class quastion13 {

	public static void main(String[] args) {
		
		/*
		 * Question-13:

Print following chessboard using nested for loops.
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W

NOTE:
1. Total 8 rows and 8 columns.
2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.
		 * 
		 * 
		 */
		
		int rows=8;
		int columns=8;
		
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print("W");
			}
			System.out.print("B");
		}System.out.println();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print("B");
			}
			System.out.print("W");
		}
		System.out.println();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print("W");
			}
			System.out.print("B");
		}
		System.out.println();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print("B");
			}
			System.out.print("W");
		}
		System.out.println();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print("W");
			}
			System.out.print("B");
		}
		System.out.println();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print("B");
			}
			System.out.print("W");
		}
		System.out.println();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print("W");
			}
			System.out.print("B");
		}
		System.out.println();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=i;j++) {
				System.out.print("B");
			}
			System.out.print("W");
		}
	}

}
