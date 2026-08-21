package aug21QuestionsSolve;

import java.util.Scanner;

public class PrintDuplicateCharacterApp {

	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        System.out.println("Enter the string");
	        String str = s.nextLine();

	        int i, j, count;

	        System.out.println("Duplicate characters are:");

	        for (i = 0; i < str.length(); i++) {

	            char ch = str.charAt(i);
	            count = 0;

	            // Check frequency
	            for (j = 0; j < str.length(); j++) {

	                if (ch == str.charAt(j)) {
	                    count++;
	                }
	            }

	            // Print character if it occurs more than once
	            if (count > 1) {

	                // Make sure we don't print the same duplicate again
	                boolean alreadyPrinted = false;

	                for (j = 0; j < i; j++) {

	                    if (ch == str.charAt(j)) {
	                        alreadyPrinted = true;
	                        break;
	                    }
	                }

	                if (!alreadyPrinted) {
	                    System.out.println(ch);
	                }
	            }
	        }
	    }
	
}
