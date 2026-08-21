package aug21QuestionsSolve;

import java.util.Scanner;

public class PrintAllUniqueCharacterApp {
	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        System.out.println("Enter the string");
	        String str = s.nextLine();

	        int i, j, count;

	        System.out.println("Unique characters are:");

	        for (i = 0; i < str.length(); i++) {

	            count = 0;

	            for (j = 0; j < str.length(); j++) {

	                if (str.charAt(i) == str.charAt(j)) {
	                    count++;
	                }
	            }

	            if (count == 1) {
	                System.out.println(str.charAt(i));
	            }
	        }
	    }
	
}
