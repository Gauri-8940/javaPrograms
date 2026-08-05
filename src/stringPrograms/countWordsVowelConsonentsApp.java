package stringPrograms;

import java.util.Scanner;

class countWordsVowelConsonentsApp {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter any string");
        String str = s.nextLine();

        int v = 0, c = 0, w = 1;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                v++;

            } else if (ch == ' ') {

                if (i < str.length() - 1 && str.charAt(i + 1) != ' ') {
                    w++;
                }

            } else {

                c++;
            }
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
        System.out.println("Words = " + w);
    }

}
