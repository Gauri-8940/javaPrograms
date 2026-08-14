package aug14StringQuestionsSolve;

import java.util.Scanner;

public class printWordOnNewLineSolution2 {

	public static void main(String[] args) {
		
		
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any string");
		String s=sc.nextLine();

	        for (int i = 0; i < s.length(); i++) {

	            if (s.charAt(i) == ' ') {
	                System.out.println();
	            } else {
	                System.out.print(s.charAt(i));
	            }
	        }

	}

}
