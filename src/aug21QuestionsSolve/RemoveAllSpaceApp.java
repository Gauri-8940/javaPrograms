package aug21QuestionsSolve;

import java.util.Scanner;

public class RemoveAllSpaceApp {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = s.nextLine();

        int i, j, len;

        char ch[] = new char[str.length()];

        for (i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        len = ch.length;

        for (i = 0; i < len; i++) {

            if (ch[i] == ' ') {

                for (j = i; j < len - 1; j++) {
                    ch[j] = ch[j + 1];
                }

                len--;
                i--;
            }
        }

        System.out.println("String after removing all spaces:");

        for (i = 0; i < len; i++) {
            System.out.print(ch[i]);
        }
    }
}