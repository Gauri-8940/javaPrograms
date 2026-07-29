package stringPrograms;

import java.util.Scanner;

public class RemoveAllOccurrencesSolution1 {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        System.out.print("Enter the character to remove: ");
	        char ch = sc.next().charAt(0);

	        System.out.print("String after removing all occurrences: ");

	        for (int i = 0; i < str.length(); i++) {

	            if (str.charAt(i) != ch) {
	                System.out.print(str.charAt(i));
	            }
	        }

	}

}
