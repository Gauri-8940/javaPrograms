package javaPrograms;

import java.util.Scanner;

public class convertStringToUppercase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		
		System.out.println("after converting to Uppercase: ");
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			
			System.out.print(ch);
		}
		

	}

}
