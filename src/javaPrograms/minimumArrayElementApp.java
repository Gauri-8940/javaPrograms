package javaPrograms;

import java.util.Scanner;

public class minimumArrayElementApp {

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
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("minimum element is "+min);

	}

}
