package javaPrograms;

import java.util.Scanner;

public class countOccuranceCharacterApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		
		System.out.println("Enter any character");
		char find=sc.next().charAt(0);
		
		int count=0;
		

		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==find)
			{
				count++;
			}
		}
		System.out.println("occurance of character "+count);
	}

}
