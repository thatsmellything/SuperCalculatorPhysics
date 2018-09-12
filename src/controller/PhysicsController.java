package controller;

import java.util.Scanner;

public class PhysicsController
{

	public void start()
	{
		
		System.out.println("This is the super calculator Physics Version!");
		System.out.println("Please select what you want to find by typing the first letter, or first letters (multiple words) of the selection");
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
		System.out.println("What do you have?");
		System.out.println(" -----------------------");
		System.out.println("| Imperial (lbs, ounces) |");
		System.out.println("| Metric (kg, grams, mg) |");
		System.out.println("| Back                   |");
		System.out.println(" -----------------------");
		String have = weightScanner.next();
	
		
		if (have.equals("I"))
			{
			Imperial();
			}
		if(have.equals("B"))
		{
			start();
		}
		weightScanner.close();
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
			if (typeI.equals("B"))
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
				if (ouncesToo.equals("B"))
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
				
				if (poundsToo.equals("B"))
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
				P2.close();
				
			}
				public void O2I()
				{
					
					Scanner ounces = new Scanner(System.in);
					System.out.println(" ------------------------------");
					System.out.println("| How many Ounces do you have? |");
					System.out.println(" ------------------------------");
					double ounces2lbs;
					ounces2lbs = ounces.nextDouble();
					System.out.println(ounces2lbs + "oz = " + ounces2lbs/16 + " lbs");
					System.out.println("RESTART?");
					String restart;
					restart = ounces.next();
					if (restart.equals("R"))
					{
						start();
					}
					ounces.close();
					
					
					
				}
				public void O2M()
				{
					
				}
				public void P2I()
				{
					Scanner lbs = new Scanner(System.in);
					System.out.println(" ------------------------------");
					System.out.println("| How many Pounds do you have? |");
					System.out.println(" ------------------------------");
					double lbs2oz;
					lbs2oz = lbs.nextDouble();
					System.out.println(lbs2oz + "lbs = " + lbs2oz*16 + " Ounces");
					System.out.println("RESTART?");
					String restart;
					restart = lbs.next();
					if (restart.equals("R"))
					{
						start();
					}
					lbs.close();
				
				}
				public void P2M()
				{
					
				}
}

		


