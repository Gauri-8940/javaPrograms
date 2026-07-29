package stringPrograms;

import java.util.Scanner;

public class RemoveAllOccurrencesSolution2 {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        System.out.print("Enter the character to remove: ");
	        char ch = sc.next().charAt(0);

	        char arr[] = new char[str.length()];

	        for (int i = 0; i < str.length(); i++) {
	            arr[i] = str.charAt(i);
	        }

	        int j = 0;

	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] != ch) {
	                arr[j] = arr[i];
	                j++;
	            }
	        }

	        System.out.print("String after removing all occurrences: ");

	        for (int i = 0; i < j; i++) {
	            System.out.print(arr[i]);
	        }

	}

}
