package aug14StringQuestionsSolve;

import java.util.Scanner;

/*
Reverse Only Words Starting with a Vowel
Input
apple is orange ball

Output

elppa si egnaro ball

*/

public class ReverseOnlyWordsStartingwithowel {


		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        String str = sc.nextLine();

		        int start = 0;

		        for (int i = 0; i <= str.length(); i++) {

		            if (i == str.length() || str.charAt(i) == ' ') {

		                char ch = str.charAt(start);

		                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
		                    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

		                    for (int j = i - 1; j >= start; j--)
		                        System.out.print(str.charAt(j));

		                } else {

		                    for (int j = start; j < i; j++)
		                        System.out.print(str.charAt(j));
		                }

		                if (i != str.length())
		                    System.out.print(" ");

		                start = i + 1;
		            }
		        }
		    }
	
	}

