package stringPrograms;

import java.util.Scanner;

public class palindromeSolution2 {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the string");
	        String s = sc.nextLine();

	        int start = 0;
	        int end = s.length() - 1;
	        boolean flag = true;

	        while (start < end) {

	            if (s.charAt(start) != s.charAt(end)) {
	                flag = false;
	                break;
	            }

	            start++;
	            end--;
	        }

	        if (flag) {
	            System.out.println("String is palindrome");
	        } else {
	            System.out.println("String is not palindrome");
	        }

	}

}
