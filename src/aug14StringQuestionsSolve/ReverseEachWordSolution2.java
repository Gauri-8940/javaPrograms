package aug14StringQuestionsSolve;

import java.util.Scanner;

public class ReverseEachWordSolution2 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter String: ");
		        String str = sc.nextLine();

		        int start = 0;

		        for (int i = 0; i <= str.length(); i++) {

		            // Word completed or string ended
		            if (i == str.length() || str.charAt(i) == ' ') {

		                // Print current word in reverse
		                for (int j = i - 1; j >= start; j--) {
		                    System.out.print(str.charAt(j));
		                }

		                // Print space after every word except last
		                if (i != str.length()) {
		                    System.out.print(" ");
		                }

		                // Next word starts after space
		                start = i + 1;
		            }
		        }
		    

	}

}
