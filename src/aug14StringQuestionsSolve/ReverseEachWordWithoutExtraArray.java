package aug14StringQuestionsSolve;

import java.util.Scanner;

/*
Input
Java is easy
Output
avaJ si ysae

*/

public class ReverseEachWordWithoutExtraArray {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter String: ");
		        String s = sc.nextLine();

		        int start = 0;

		        for (int i = 0; i <= s.length(); i++) {

		            if (i == s.length() || s.charAt(i) == ' ') {

		                int end = i - 1;

		                if (i == s.length()) {
		                    end = i - 1;
		                }

		                while (end >= start) {
		                    System.out.print(s.charAt(end));
		                    end--;
		                }

		                if (i != s.length()) {
		                    System.out.print(" ");
		                }

		                start = i + 1;
		            }
		        }
		    }
}
