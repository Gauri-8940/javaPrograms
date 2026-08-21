package aug21QuestionsSolve;

import java.util.Scanner;

public class countAlphabetsDigitsSpececialCharacterApp {

	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        System.out.println("Enter any string");
	        String str = s.nextLine();

	        int alphabet = 0;
	        int digit = 0;
	        int special = 0;

	        char ch[] = new char[str.length()];

	        for (int i = 0; i < str.length(); i++) {
	            ch[i] = str.charAt(i);
	        }

	        for (int i = 0; i < ch.length; i++) {

	            if ((ch[i] >= 'a' && ch[i] <= 'z') ||
	                (ch[i] >= 'A' && ch[i] <= 'Z')) {

	                alphabet++;

	            } else if (ch[i] >= '0' && ch[i] <= '9') {

	                digit++;

	            } else {

	                special++;
	            }
	        }

	        System.out.println("Total alphabets = " + alphabet);
	        System.out.println("Total digits = " + digit);
	        System.out.println("Total special characters = " + special);
	    }
	}


