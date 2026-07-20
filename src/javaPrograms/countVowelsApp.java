package javaPrograms;

import java.util.Scanner;

public class countVowelsApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				count++;
			}
		}
		
		System.out.println("number of vowels in string "+count);
	}

}
