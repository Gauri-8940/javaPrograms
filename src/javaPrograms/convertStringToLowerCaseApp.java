package javaPrograms;

import java.util.Scanner;

public class convertStringToLowerCaseApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string ");
		String s=sc.nextLine();
		
		System.out.println("After converting to lowerCase :");
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				ch=(char)(ch+32);
			}
			System.out.print(ch);
		}
		

	}

}
