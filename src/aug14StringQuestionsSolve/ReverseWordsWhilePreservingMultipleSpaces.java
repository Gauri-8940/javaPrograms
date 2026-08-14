package aug14StringQuestionsSolve;

import java.util.Scanner;

/*
Input:

Java is easy

Output:

avaJ si ysae

*/


public class ReverseWordsWhilePreservingMultipleSpaces {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter String: ");
		        String s = sc.nextLine();

		        int start = 0;

		        for (int i = 0; i <= s.length(); i++) {

		            // End of a word
		            if (i == s.length() || s.charAt(i) == ' ') {

		                int end = i - 1;

		                // Reverse current word
		                while (end >= start) {
		                    System.out.print(s.charAt(end));
		                    end--;
		                }

		                // Print all spaces exactly as they appear
		                while (i < s.length() && s.charAt(i) == ' ') {
		                    System.out.print(" ");
		                    i++;
		                }

		                // Next word starts here
		                start = i;
		            }
		        }
		    }
}
