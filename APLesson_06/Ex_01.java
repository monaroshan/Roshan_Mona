import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.next();
		System.out.println(" ");
		
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}