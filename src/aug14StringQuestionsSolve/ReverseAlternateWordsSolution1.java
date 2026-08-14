package aug14StringQuestionsSolve;

import java.util.Scanner;

/*Reverse Alternate Words
Input
Java is easy to learn

Output

avaJ is ysae to nrael
 */

public class ReverseAlternateWordsSolution1 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        String str = sc.nextLine();

		        int start = 0;
		        int count = 1;

		        for (int i = 0; i <= str.length(); i++) {

		            if (i == str.length() || str.charAt(i) == ' ') {

		                if (count % 2 != 0) {

		                    for (int j = i - 1; j >= start; j--)
		                        System.out.print(str.charAt(j));

		                } else {

		                    for (int j = start; j < i; j++)
		                        System.out.print(str.charAt(j));
		                }

		                if (i != str.length())
		                    System.out.print(" ");

		                start = i + 1;
		                count++;
		            }
		        }
		    }
}
