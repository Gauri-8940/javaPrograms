package javaPrograms;

import java.util.Scanner;

public class countConsonantApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		String s=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				if(ch!='a' && ch!='A' && ch!='e' && ch!='E' && ch!='i' && ch!='I' && ch!='o' && ch!='O' && ch!='u' && ch!='U') {
					count++;
				}
			}
		}
		
		System.out.println("Number of consonants "+count);

	}

}
