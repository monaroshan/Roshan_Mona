import java.util.ArrayList;
import java.util.Scanner;

public class CountingMachine
{
	
	public static void main(String[]args)
	{
		double total = 0;
		ArrayList<Money> inventory = new ArrayList<Money>();
		inventory.add(new Coin("Penny", "2.5g", 00.01));
		inventory.add(new Coin("Nickel", "5.0g", 00.05));
		inventory.add(new Coin("Dime", "2.268g", 00.10));
		inventory.add(new Coin("Quarter", "5.670g", 00.25));
		inventory.add(new WhatisInheritance("One", "Washington", 01.00));
		inventory.add(new WhatisInheritance("Five", "Lincoln", 05.00));
		inventory.add(new WhatisInheritance("Ten", "Hamilton", 10.00));
		inventory.add(new WhatisInheritance("Twenty", "Jackson", 20.00));
		inventory.add(new WhatisInheritance("Hundred", "Franklin", 100.00));
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your bills and coins...");
		String cash = kb.nextLine();
		
		Scanner scan = new Scanner(cash);
		
		while(scan.hasNext())
		{
			String x = scan.next();
			
			for(Money b : inventory)
			{
				if(b.scan().equals(x) || b.getName().equals(x))
				{
					b.setCount(b.getCount()+1);
				}
			}
		}
		for(Money x : inventory)
		{
			//String x = scan.next();
			total += x.getValue() * x.getCount();
		}
		
		System.out.println(total);
	}
}