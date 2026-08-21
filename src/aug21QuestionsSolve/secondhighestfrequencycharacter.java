package aug21QuestionsSolve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class secondhighestfrequencycharacter {

	

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();

	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }

	        char highestChar = 0;
	        char secondHighestChar = 0;

	        int highestFrequency = 0;
	        int secondHighestFrequency = 0;

	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {

	            int frequency = entry.getValue();

	            if (frequency > highestFrequency) {

	                secondHighestFrequency = highestFrequency;
	                secondHighestChar = highestChar;

	                highestFrequency = frequency;
	                highestChar = entry.getKey();

	            } else if (frequency > secondHighestFrequency
	                    && frequency < highestFrequency) {

	                secondHighestFrequency = frequency;
	                secondHighestChar = entry.getKey();
	            }
	        }

	        if (secondHighestFrequency == 0) {
	            System.out.println("No second highest-frequency character found");
	        } else {
	            System.out.println(
	                "Second highest-frequency character is '"
	                + secondHighestChar
	                + "' with frequency "
	                + secondHighestFrequency
	            );
	        }

	        scanner.close();
	    }
	

}
