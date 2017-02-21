import java.util.Scanner;
class TextMatch
{
	public static void main(String args[])
	{
		Scanner text=new Scanner(System.in);
		System.out.println("Enter your text here..:");

		String text1=text.next();

		Scanner word=new Scanner(System.in);
		System.out.println("Enter your word here now..:");
		String word1=word.next();
	
		int range=text1.length()-word1.length();
		int count=0;
		for(int i=0;i<range;i++)
		{
			for(int j=0;j<word1.length();j++)
			{
				if(text1.charAt(i+j)!=word1.charAt(j))
				{
					
					break;
				}
				else if(j==word1.length()-1)
				{
					count++;
					continue;
				}
			}
		}
		if(count!=0)
		{
			System.out.println("There are "+count+ "words in your text.!");
		}
		
		else
		{
			System.out.println("There are no any matching words.!");
		}
		
	}
}
