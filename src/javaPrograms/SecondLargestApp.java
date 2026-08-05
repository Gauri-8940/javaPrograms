package javaPrograms;

public class SecondLargestApp {

	public static void main(String[] args) {

        int[] a = {10, 5, 8, 20, 15};

        int largest = a[0];
        int secondLargest = a[1];

        
        if (secondLargest > largest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        for (int i = 2; i < a.length; i++) {

            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
