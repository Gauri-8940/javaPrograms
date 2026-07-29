package stringPrograms;

import java.util.Scanner;

public class removeLastOccurrenceSolution1 {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();

	        System.out.print("Enter the character to remove: ");
	        char ch = sc.next().charAt(0);

	        int lastIndex = -1;

	        for (int i = 0; i < s.length(); i++) {

	            if (s.charAt(i) == ch) {
	                lastIndex = i;
	            }
	        }

	        System.out.print("String after removing last occurrence: ");

	        for (int i = 0; i < s.length(); i++) {

	            if (i == lastIndex) {
	                continue;
	            }

	            System.out.print(s.charAt(i));
	        }

	}

}
