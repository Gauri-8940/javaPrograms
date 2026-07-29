package stringPrograms;

import java.util.Scanner;

public class removeLastOccurrenceSolution2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = sc.next().charAt(0);

        char arr[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ch) {
                lastIndex = i;
            }
        }

        if (lastIndex != -1) {

            for (int i = lastIndex; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }

        System.out.print("String after removing last occurrence: ");

        for (int i = 0; i < arr.length - (lastIndex == -1 ? 0 : 1); i++) {
            System.out.print(arr[i]);
        }

	}

}
