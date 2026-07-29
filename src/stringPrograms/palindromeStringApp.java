package stringPrograms;

import java.util.Scanner;

public class palindromeStringApp {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the string");
	        String s = sc.nextLine();

	        int len = s.length();
	        boolean flag = false;

	        for (int i = 0; i < len / 2; i++) {

	            if (s.charAt(i) != s.charAt(len - i - 1)) {
	                flag = true;
	                break;
	            }
	        }

	        if (flag == true) {
	            System.out.println("String is not palindrome");
	        } else {
	            System.out.println("String is palindrome");
	        }
 
	}

}
