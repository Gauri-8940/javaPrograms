package stringPrograms;

import java.util.Scanner;

public class reverseStringApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter the string");
		   String s=sc.nextLine();
		   
		   char ch[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
		    ch[i] = s.charAt(i);
		}
		
		int start = 0;
		int end = ch.length - 1;

		while (start < end) {
		    char temp = ch[start];
		    ch[start] = ch[end];
		    ch[end] = temp;
		    start++;
		    end--;
		}

		System.out.println("String after reversing");

		for (int i = 0; i < ch.length; i++) {
		    System.out.print(ch[i]);
		}


	}

}
