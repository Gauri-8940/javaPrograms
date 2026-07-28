package javaPrograms;

import java.util.Scanner;

public class powerNumberApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Base and index");
		int base=sc.nextInt();
		int index=sc.nextInt();
		
		int p=1;
		
		for(int i=1;i<=index;i++) {
			p=p*base;
		}
		
		System.out.println("power of number is "+p);
	}

}
