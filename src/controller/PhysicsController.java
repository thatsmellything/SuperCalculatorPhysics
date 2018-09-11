package controller;

import java.util.Scanner;

public class PhysicsController
{

	public void start()
	{
		System.out.println("This is the super calculator Physics Version!");
		System.out.println("Please select what you want to find by typing the first letter, or first letters of the selection");
		System.out.println(" ------------------- ");
		System.out.println("| Weight Conversion |");
		System.out.println("| Potential Energy  |");
		System.out.println("| Kinetic Energy    |");
		System.out.println("| Net Energy        |");
		System.out.println(" ------------------- ");
		Scanner inputScanner = new Scanner(System.in);
		String answer = inputScanner.nextLine();
		
		if (answer.equals("WC"))
		{
			weightConversion();
		}
		if (answer.equals("PE"))
		{
			pEnergy();
		}
		
		if (answer.equals("KE"))
		{
			kEnergy();
		}
		
		if (answer.equals("NE"))
		{
			nEnergy();
		}
		inputScanner.close();
	}
	
	public void weightConversion()
	{
		Scanner weightScanner = new Scanner(System.in);
		System.out.println("What do you have? Type the first letter");
		System.out.println(" -----------------------");
		System.out.println("| Imperial (lbs, ounces) |");
		System.out.println("| Metric (kg, grams, mg) |");
		System.out.println("| Back                   |");
		System.out.println(" -----------------------");
		String have = weightScanner.nextLine();
		have = have;
		if (have.equals("I"))
			{
			
			System.out.println("Pounds or Ounces?");
			System.out.println(" --------");
			System.out.println("| Pounds |");
			System.out.println("| Ounces |");
			System.out.println("| Back   |");
			System.out.println(" --------");
			Scanner PandO;
			PandO = new Scanner(System.in);
			String typeI = PandO.nextLine();
			if (typeI.equals("P"))
				{

				System.out.println("What are you trying to find?");
				System.out.println(" -----------------------");
				System.out.println("| Imperial (lbs, ounces) |");
				System.out.println("| Metric (kg, grams, mg) |");
				System.out.println("| Back                   |");
				System.out.println(" -----------------------");
				String poundsToo = PandO.nextLine();
				
				if (poundsToo.equals("Back"))
					{
					
					weightConversion();
					have.equals("I");
					}
				}
			if (typeI.equals("O"))
			{
			String ouncesToo = weightScanner.nextLine();
			System.out.println("What are you trying to find?");
			System.out.println(" -----------------------");
			System.out.println("| Imperial (lbs, ounces) |");
			System.out.println("| Metric (kg, grams, mg) |");
			System.out.println("| Back                   |");
			System.out.println(" -----------------------");
			}
			if(typeI.equals("Back"))
			{
				weightConversion();
			}
			PandO.close();
			}
		if(have.equals("Back"))
		{
			start();
		}
		
		weightScanner.close();
	}

	public void pEnergy()
	{
		
	}
	
	public void kEnergy()
	{
		
	}
	
	public void nEnergy()
	{
		
	}
}
