package javaPrograms;

import java.util.Scanner;

public class duplicateArrayElements {

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
			
			int i,j;
			
			for(i=0;i<a.length;i++) {
				for(j=0;j<i;j++) {
					if(a[i]==a[j]) {
						break;
					}
				}
				
				if(i==j) {
					for(j=i+1;j<a.length;j++) {
						if(a[i]==a[j]) {
							System.out.println(a[i]+"\t")
							;
							break;
						}
					}
				}
			}

	}

}
