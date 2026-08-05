package javaPrograms;

import java.util.Scanner;

public class MoveZerosApp {

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
		
		int j=0;
		
		for(int i=0;i<a.length;i++)
		{
			 if (a[i] != 0){
				 
			  
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;				 
				 j++;
			}			 
		}
		for(int num:a) {
			System.out.println(num+"\t");	
			
		}
	}
	

}
