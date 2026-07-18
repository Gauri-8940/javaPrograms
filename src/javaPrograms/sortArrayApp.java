package javaPrograms;

import java.util.Scanner;

public class sortArrayApp {

	public static void main(String[] args) {
		
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the values in array");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting array \n");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}

	}

}
