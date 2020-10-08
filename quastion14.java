package assignment_5;

public class quastion14 {

	public static void main(String[] args) {
		
		/*Question-14:

Write nested loop to draw this pattern

##
#  #
#   #
#    #
#     #
#      #
#        #
		 * 
		 * 
		 */
		for(int i =1;i<=7;i++) {
			
			for(int j =i;j<=i;j++) {
				System.out.print("*");
				for(int k=1;k<=i;k++) {
					System.out.print(" ");
				}
				
				
			}
			System.out.println("*");
			
		}
		

	}

}
