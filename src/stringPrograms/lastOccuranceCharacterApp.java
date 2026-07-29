package stringPrograms;

import java.util.Scanner;

public class lastOccuranceCharacterApp {

	public static void main(String[] args) {
		
		    Scanner sc= new Scanner(System.in);
	        
	        System.out.print("Enter the string: ");
	        String s = sc.nextLine();
	        
	        System.out.print("Enter the character to find: ");
	        char c = sc.next().charAt(0);
	        
	        int index = findLastOccurrence(s, c);
	        
	        if (index != -1) {
	            System.out.printf("Last occurrence of '%c' is at index %d%n", c, index);
	        } else {
	            System.out.printf("Character '%c' not found in the string%n", c);
	        }
	}
	
     public static int findLastOccurrence(String str, char c) {
        int lastIndex = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

}
