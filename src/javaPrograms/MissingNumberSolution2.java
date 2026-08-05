package javaPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class MissingNumberSolution2 {

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

	        HashSet<Integer> set = new HashSet<>();

	        for(int num:a)
	            set.add(num);

	        int min = a[0];
	        int max = a[0];

	        for(int num:a){

	            if(num<min)
	                min=num;

	            if(num>max)
	                max=num;
	        }

	        for(int i=min;i<=max;i++){

	            if(!set.contains(i)){
	                System.out.print(i+" ");
	            }
	        }
	    }
}
