package stringPrograms;

import java.util.Scanner;

public class countOccurancesOfCharacterApp {

	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();
	        
	        System.out.print("Enter the character to count: ");
	        char c = sc.next().charAt(0);
	        
	        int count = countOccurrences(s, c);
	        
	        System.out.printf("Character '%c' occurs %d times in the string.%n", c, count);
	}
	
	public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }


}
