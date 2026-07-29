package stringPrograms;

import java.util.Scanner;

public class lowestFrequencyCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char lowestChar = '\0';
        int lowestCount = s.length();

        for (int i = 0; i < s.length(); i++) {

            boolean visited = false;

            for (int k = 0; k < i; k++) {
                if (s.charAt(i) == s.charAt(k)) {
                    visited = true;
                    break;
                }
            }

            if (visited)
                continue;

            int count = 1;

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count < lowestCount) {
                lowestCount = count;
                lowestChar = s.charAt(i);
            }
        }

        System.out.println("Lowest frequency character is '" +
                lowestChar + "' with frequency " + lowestCount);

	}

}
