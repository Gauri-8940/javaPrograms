package javaPrograms;

import java.util.Scanner;

public class MissingNumberApp {

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
			
			int i,j,k,temp;
			
			for(i=0;i<a.length;i++) {
				for(j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			
			for(i=0;i<a.length-1;i++) {
				for(k=a[i]+1;k<a[i+1];k++) {
					System.out.print(k+"\t");
				}
			}
			

	}

}
