package javaPrograms;

import java.util.Scanner;

public class compositeNumberApp {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count>3) {
			System.out.println("composite number");
		}else {
			System.out.println("Not composite number");
		}

	}

}
