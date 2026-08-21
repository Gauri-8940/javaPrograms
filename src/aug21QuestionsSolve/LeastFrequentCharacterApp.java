package aug21QuestionsSolve;

import java.util.Scanner;

public class LeastFrequentCharacterApp {

	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        System.out.println("Enter the string");
	        String str = s.nextLine();

	        char ch[] = new char[str.length()];

	        for (int i = 0; i < str.length(); i++) {
	            ch[i] = str.charAt(i);
	        }

	        int minFrequency = ch.length;
	        char leastFrequent = 0;

	        for (int i = 0; i < ch.length; i++) {

	            int count = 0;

	            for (int j = 0; j < ch.length; j++) {

	                if (ch[i] == ch[j]) {
	                    count++;
	                }
	            }

	            if (count < minFrequency) {
	                minFrequency = count;
	                leastFrequent = ch[i];
	            }
	        }

	        System.out.println(
	            "Least frequent character is ---> "
	            + leastFrequent
	            + " with frequency "
	            + minFrequency
	        );
	    }
	}

