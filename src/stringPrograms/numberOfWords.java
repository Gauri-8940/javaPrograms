package stringPrograms;

import java.util.Scanner;

public class numberOfWords {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = s.nextLine();

        int word = 1;
        
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                word++;
            }
        }

        System.out.println("Total number of words in string: " + word);
        
	}

}
