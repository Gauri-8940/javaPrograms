package aug14StringQuestionsSolve;

import java.util.Scanner;

/*
 Problem
Input
Programming

Output
Prigrammong
 */

public class ReverseOnlyVowels {

		    public static boolean isVowel(char ch) {

		        if (ch == 'a' || ch == 'e' || ch == 'i' ||
		            ch == 'o' || ch == 'u' ||
		            ch == 'A' || ch == 'E' || ch == 'I' ||
		            ch == 'O' || ch == 'U') {

		            return true;
		        }

		        return false;
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter String : ");
		        String s = sc.nextLine();

		        char ch[] = s.toCharArray();

		        int left = 0;
		        int right = ch.length - 1;

		        while (left < right) {

		            while (left < right && !isVowel(ch[left])) {
		                left++;
		            }

		            while (left < right && !isVowel(ch[right])) {
		                right--;
		            }

		            char temp = ch[left];
		            ch[left] = ch[right];
		            ch[right] = temp;

		            left++;
		            right--;
		        }

		        for (int i = 0; i < ch.length; i++) {
		            System.out.print(ch[i]);
		        }
		    }		
	}

