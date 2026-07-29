package stringPrograms;

import java.util.Scanner;

public class findAllOccurancessOfCharacterApp {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        System.out.print("Enter the character to find: ");
        char c = sc.next().charAt(0);
        
        System.out.printf("All occurrences of '%c' are at indices: ", c);
        findAllOccurrences(s, c);

	}

	
	public static void findAllOccurrences(String str, char c) {
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.printf("Character '%c' not found in the string%n", c);
        }
    }
}
