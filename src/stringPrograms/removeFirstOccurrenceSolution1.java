package stringPrograms;

import java.util.Scanner;

public class removeFirstOccurrenceSolution1 {

	public static void main(String[] args) {
		

		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();

	        System.out.print("Enter the character to remove: ");
	        char ch = sc.next().charAt(0);

	        boolean removed = false;

	        System.out.print("String after removing first occurrence: ");

	        for (int i = 0; i < s.length(); i++) {

	            if (s.charAt(i) == ch && !removed) {
	                removed = true;  
	                continue;
	            }

	            System.out.print(s.charAt(i));
	        }
	}

}
