package aug12SolveProblems;

import java.util.HashMap;
import java.util.Scanner;

public class targetSumIndexsolution2 {

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
			
			HashMap<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < a.length; i++) {

	            int required = target - a[i];

	            if (map.containsKey(required)) {
	                System.out.println("Index: " + map.get(required) + ", " + i);
	                return;
	            }

	            map.put(a[i], i);
	        }

	}

}
