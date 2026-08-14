package aug14StringQuestionsSolve;

import java.util.Scanner;
/*Reverse the Order of Words
Input
Java is easy
Output
easy is Java   
*/

public class ReverseOrderOfWordsSolution1 {

	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);

	        String str = sc.nextLine();

	        int end = str.length();

	        for (int i = str.length() - 1; i >= 0; i--) {

	            if (str.charAt(i) == ' ') {

	                for (int j = i + 1; j < end; j++) {
	                    System.out.print(str.charAt(j));
	                }

	                System.out.print(" ");

	                end = i;
	            }
	        }

	        for (int i = 0; i < end; i++) {
	            System.out.print(str.charAt(i));
	        }

	}

}
