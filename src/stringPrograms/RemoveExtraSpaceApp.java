package stringPrograms;

import java.util.Scanner;

public class RemoveExtraSpaceApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = sc.nextLine();

        char ch[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        int i, j, len;
        len = ch.length;

        for (i = 0; i < len - 1; i++) {

            if (ch[i] == ' ' && ch[i + 1] == ' ') {

                for (j = i; j < len - 1; j++) {
                    ch[j] = ch[j + 1];
                }

                len--;   
                i--;
            }
        }

        System.out.println("String after removing extra space");

        for (i = 0; i < len; i++) {
            System.out.print(ch[i]);
        }

	}

}
