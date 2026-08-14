package aug14StringQuestionsSolve;

import java.util.Scanner;

public class ReverseEachWordUsingRecursion {

	    static void reverse(String str, int index) {

	        if (index == str.length())
	            return;

	        reverse(str, index + 1);

	        System.out.print(str.charAt(index));
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String str = sc.nextLine();

	        reverse(str, 0);
	    }
	
}
