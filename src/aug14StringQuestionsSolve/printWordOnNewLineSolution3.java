package aug14StringQuestionsSolve;

import java.util.Scanner;

public class printWordOnNewLineSolution3 {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter any string");
			String s=sc.nextLine();

        String word = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {

                if (word.length() > 0) {
                    System.out.println(word);
                    word = "";
                }
            }
        }

        if (word.length() > 0) {
            System.out.println(word);
        }

	}

}
