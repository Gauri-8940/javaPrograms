package aug21QuestionsSolve;

import java.util.Scanner;

public class RemoveExtraSpaceApp {	
		public static void main(String[] args) {

			Scanner s=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=s.nextLine();
			
			int i,j,len;
			char ch[]=new char[str.length()];
			for(i=0;i<str.length();i++) {
				ch[i]=str.charAt(i);
			}
			
			len=ch.length;
			for(i=0;i<len-1;i++)
			{
				if(ch[i]==' '&&ch[i+1]==' ')
				{
					for(j=i;j<len-1;j++)
					{
						ch[j]=ch[j+1];
					}
					len--;
					i--;
				}
			}
			System.out.println("String after removing extra space");
			for(i=0;i<len;i++)
			{
				System.out.print(ch[i]);
			}
		}
}
