package javaPrograms;

import java.util.Scanner;

public class printCharacterOnNewLineApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}

	}

}
