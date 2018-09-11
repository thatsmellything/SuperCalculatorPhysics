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
	
		
		if (have.equals("I"))
			{
			Imperial();
			}
		if(have.equals("Back"))
		{
			start();
		}
	}
		public void Imperial()
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
				Pounds2();
				}
			if (typeI.equals("O"))
			{
				Ounces2();
			}
			if (typeI.equals("Back"))
			{
				weightConversion();
			}
			PandO.close();
			{
			}
		}
			public void Ounces2()
			{
				Scanner O2 = new Scanner(System.in);
				System.out.println("What are you trying to find?");
				System.out.println(" -----------------------");
				System.out.println("| Imperial (lbs, ounces) |");
				System.out.println("| Metric (kg, grams, mg) |");
				System.out.println("| Back                   |");
				System.out.println(" -----------------------");
				String ouncesToo = O2.nextLine();
				if (ouncesToo.equals("I"))
				{
					O2I();
				}
				if (ouncesToo.equals("M"))
				{
					O2M();
				}
				if (ouncesToo.equals("Back"))
				{
					Imperial();
				}
			}
			public void Pounds2()

			{
				Scanner P2 = new Scanner(System.in);
				System.out.println("What are you trying to find?");
				System.out.println(" -----------------------");
				System.out.println("| Imperial (lbs, ounces) |");
				System.out.println("| Metric (kg, grams, mg) |");
				System.out.println("| Back                   |");
				System.out.println(" -----------------------");
				String poundsToo = P2.nextLine();
				
				if (poundsToo.equals("Back"))
					{
					Imperial();
					}
				if (poundsToo.equals("I"))
				{
					P2I();
				}
				if (poundsToo.equals("M"))
				{
					P2M();
				}
				
			}
				public void O2I()
				{
					
				}
				public void O2M()
				{
					
				}
				public void P2I()
				{
					
				}
				public void P2M()
				{
					
				}
}

		


