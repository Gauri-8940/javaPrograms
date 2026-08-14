package aug14StringQuestionsSolve;

import java.util.Scanner;

public class RemoveExtraSpaceApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = sc.nextLine();

		boolean spaceFound = false;

		for (int i = 0; i < s.length(); i++) {

		    char ch = s.charAt(i);

		    if (ch != ' ') {
		        System.out.print(ch);
		        spaceFound = false;
		    } 
		    else if (!spaceFound) {
		        System.out.print(" ");
		        spaceFound = true;
		    }
		}

	}

}
