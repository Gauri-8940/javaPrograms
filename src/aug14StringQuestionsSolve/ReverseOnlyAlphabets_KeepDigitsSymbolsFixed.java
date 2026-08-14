package aug14StringQuestionsSolve;

import java.util.Scanner;

/*
Input

ab12cd

Output

dc12ba

*/


public class ReverseOnlyAlphabets_KeepDigitsSymbolsFixed {

	public static void main(String[] args) {
		
	
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter String:");
		        String str = sc.nextLine();

		        char[] arr = str.toCharArray();

		        int left = 0;
		        int right = arr.length - 1;

		        while (left < right) {

		            // Move left until alphabet
		            if (!isAlphabet(arr[left])) {
		                left++;
		                continue;
		            }

		            // Move right until alphabet
		            if (!isAlphabet(arr[right])) {
		                right--;
		                continue;
		            }

		            // Swap alphabets
		            char temp = arr[left];
		            arr[left] = arr[right];
		            arr[right] = temp;

		            left++;
		            right--;
		        }

		        System.out.println("Output:");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i]);
		        }
		    }

		    static boolean isAlphabet(char ch) {

		        if ((ch >= 'a' && ch <= 'z') ||
		            (ch >= 'A' && ch <= 'Z')) {

		            return true;
		        }

		        return false;
		    }
		

	}
