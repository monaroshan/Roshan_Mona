import java.util.Scanner;
public class ToyStoreRunner 
{
	public static void main(String[]args)
	{
		String listoftoys = "";
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter in the list of toys: ");
		listoftoys = kb.nextLine();
		
		ToyStore TS = new ToyStore(listoftoys);
		System.out.println(TS);
		System.out.println("Most Frequent Toy: " + TS.getMostFrequentToy());
		System.out.println("Most Frequest Type of Toy: " + TS.getMostFrequentType());
		
	}
}