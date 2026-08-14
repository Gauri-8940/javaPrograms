package aug14StringQuestionsSolve;

import java.util.Scanner;

public class ReverseEachWordSolution1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String s = sc.nextLine();

		
		String word = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {

                word = ch + word;

            } else {

                System.out.print(word + " ");
                word = "";
            }
        }

        // Print the last word
        System.out.print(word);

	}

}
