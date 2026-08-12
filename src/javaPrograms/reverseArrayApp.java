package javaPrograms;

import java.util.Scanner;

public class reverseArrayApp {

	public static void main(String[] args) {
		
		    Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the size of array");
			int size=sc.nextInt();
			
			int a[]=new int[size];
			
			System.out.println("Enter the values in array");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();					
			}
			
			int start=0;
			int end=a.length-1;
			
			while(start<end) {
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			}
			
			System.out.println("Array after reversing");

			for (int i = 0; i < a.length; i++) {
			    System.out.print(a[i]+"\t");
			}
	}

}
