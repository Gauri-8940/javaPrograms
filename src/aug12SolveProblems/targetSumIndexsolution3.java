package aug12SolveProblems;

import java.util.Scanner;

public class targetSumIndexsolution3 {

	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the size of array");
			int size=sc.nextInt();
			
			int a[]=new int[size];
			
			System.out.println("Enter the values in array in sorted order");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();					
			}
			
			System.out.println("Enter the target value");
			int target=sc.nextInt();
			
			
			int left = 0;
			int right = a.length - 1;

			while (left < right) {

			    int sum = a[left] + a[right];

			    if (sum == target) {
			        System.out.println("Index: " + left + ", " + right);
			        break;
			    }
			    else if (sum < target) {
			        left++;
			    }
			    else {
			        right--;
			    }
			}

	}

}
