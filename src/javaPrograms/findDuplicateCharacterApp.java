package javaPrograms;

import java.util.Scanner;

public class findDuplicateCharacterApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any string");
		String s=sc.nextLine();
		
		int i,j;
		
		System.out.println("duplicates characters are :");
		for(i=0;i<s.length();i++)
		{
			for(j=i+1;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					System.out.print(s.charAt(i)+"\t");
					break;
				}
			}
		}

	}

}
