package aug12SolveProblems;

import java.util.Scanner;

public class targetSumIndexsolution1 {

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
			
			System.out.println("Enter the target value");
			int target=sc.nextInt();
			for(int i = 0; i < a.length; i++) {
			    for(int j = i + 1; j < a.length; j++) {

			        if(a[i] + a[j] == target) {
			            System.out.println(i + " " + j);
			        }
			    }
			}

	}

}
