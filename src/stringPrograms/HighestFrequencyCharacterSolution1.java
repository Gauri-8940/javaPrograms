package stringPrograms;

import java.util.Scanner;

public class HighestFrequencyCharacterSolution1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String s = sc.nextLine();

	        char highestChar = '\0';
	        int highestCount = 0;

	        for (int i = 0; i < s.length(); i++) {

	            int count = 1;

	            for (int j = i + 1; j < s.length(); j++) {

	                if (s.charAt(i) == s.charAt(j)) {
	                    count++;
	                }
	            }

	            if (count > highestCount) {
	                highestCount = count;
	                highestChar = s.charAt(i);
	            }
	        }

	        System.out.println("Highest frequency character is '" +
	                highestChar + "' with frequency " + highestCount);

	}

}
