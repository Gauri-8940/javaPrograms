package aug14StringQuestionsSolve;

import java.util.Scanner;

/*Input
Java is easy code

Output

avaJ si easy edoc

*/


public class ReverseOnlyWordsHavingEvenLength {

	public static void main(String[] args) {
	
		
		        Scanner sc = new Scanner(System.in);

		        String str = sc.nextLine();

		        int start = 0;

		        for (int i = 0; i <= str.length(); i++) {

		            if (i == str.length() || str.charAt(i) == ' ') {

		                int len = i - start;

		                if (len % 2 == 0) {

		                    for (int j = i - 1; j >= start; j--)
		                        System.out.print(str.charAt(j));

		                } else {

		                    for (int j = start; j < i; j++)
		                        System.out.print(str.charAt(j));
		                }

		                if (i != str.length())
		                    System.out.print(" ");

		                start = i + 1;
		            }
		        }
		    }
	
}
