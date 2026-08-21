package aug21QuestionsSolve;

import java.util.Scanner;

public class CountUpperLowerDigitSpecialApp {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter any string");
        String str = s.nextLine();

        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int special = 0;

        char ch[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] >= 'A' && ch[i] <= 'Z') {

                uppercase++;

            } else if (ch[i] >= 'a' && ch[i] <= 'z') {

                lowercase++;

            } else if (ch[i] >= '0' && ch[i] <= '9') {

                digit++;

            } else {

                special++;
            }
        }

        System.out.println("Total uppercase = " + uppercase);
        System.out.println("Total lowercase = " + lowercase);
        System.out.println("Total digits = " + digit);
        System.out.println("Total special characters = " + special);
    }
}