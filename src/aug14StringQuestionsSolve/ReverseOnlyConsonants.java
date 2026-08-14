package aug14StringQuestionsSolve;

import java.util.Scanner;

/*
Problem

Input
abcdef

Output
fedcba

*/

public class ReverseOnlyConsonants {

		    public static boolean isVowel(char ch) {

		        return ch == 'a' || ch == 'e' || ch == 'i' ||
		               ch == 'o' || ch == 'u' ||
		               ch == 'A' || ch == 'E' || ch == 'I' ||
		               ch == 'O' || ch == 'U';
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter String: ");
		        String s = sc.nextLine();

		        char ch[] = s.toCharArray();

		        int left = 0;
		        int right = ch.length - 1;

		        while (left < right) {

		            // Move left until a consonant is found
		            while (left < right && isVowel(ch[left])) {
		                left++;
		            }

		            // Move right until a consonant is found
		            while (left < right && isVowel(ch[right])) {
		                right--;
		            }

		            // Swap consonants
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
