package javaPrograms;

import java.util.Scanner;

public class DuckNumberApp {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		boolean flag=false;
		
		System.out.println("Enter any Number");
		int n=sc.nextInt();
		
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			
			if(rem==0) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Duck Number");
		}else {
			System.out.println("Not Duck Number");
		}

	}

}
