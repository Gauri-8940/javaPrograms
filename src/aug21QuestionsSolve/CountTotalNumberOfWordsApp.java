package aug21QuestionsSolve;

import java.util.Scanner;

public class CountTotalNumberOfWordsApp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter any string 1:");
		String str=s.nextLine();
		
		
		char ch[]=str.toCharArray();
		int word=1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' '&&ch[i+1]!=' ') {
				word++;
			}
		}
		System.out.println("Total number of words "+word);
	}

}
