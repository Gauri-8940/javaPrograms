package stringPrograms;

import java.util.Scanner;

public class firstOccuranceCharacterApp {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();
	        
	        
	        System.out.print("Enter the character to find: ");
	        char c = scanner.next().charAt(0);
	        
	        
	        int index = findFirstOccurrence(str, c);
	        
	        if (index != -1) {
	            System.out.printf("First occurrence of '%c' is at index %d%n", c, index);
	        } else {
	            System.out.printf("Character '%c' not found in the string%n", c);
	        }
	}
	
      public static int findFirstOccurrence(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

}
