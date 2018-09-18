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
		if (have.equals("M"))
		{
			Metric();
		}
		if(have.equals("B"))
		{
			start();
		}
		weightScanner.close();
	}
		public void Metric()
		{
			System.out.println("What do you have?");
			System.out.println(" ------------");
			System.out.println("| Kilograms  |");
			System.out.println("| Grams      |");
			System.out.println("| Milligrams |");
			System.out.println("| Back       |");
			System.out.println(" ------------");
			Scanner KGM;
			KGM = new Scanner(System.in);
			String typeI = KGM.nextLine();
			if (typeI.equals("K"))
			{
				K2();
			}
			if (typeI.equals("G"))
			{
				G2();
			}
			if (typeI.equals("M"))
			{
				M2();
			}
			if (typeI.equals("B"))
			{
				weightConversion();
			}
			KGM.close();
		}
			public void K2()
			{
				Scanner K2 = new Scanner(System.in);
				System.out.println("What are you trying to find? (You have Kilos)");
				System.out.println(" -----------------------");
				System.out.println("| Imperial (lbs, ounces) |");
				System.out.println("| Metric (kg, grams, mg) |");
				System.out.println("| Back                   |");
				System.out.println(" -----------------------");
				String Kilo2 = K2.nextLine();
				if (Kilo2.equals("I"))
				{
					K2I();
				}
				if (Kilo2.equals("M"))
				{
					K2M();
				}
				if (Kilo2.equals("B"))
				{
					Metric();
				}
				K2.close();
			}
			public void G2()
			{
				Scanner G2 = new Scanner(System.in);
				System.out.println("What are you trying to find? (You have Grams)");
				System.out.println(" -----------------------");
				System.out.println("| Imperial (lbs, ounces) |");
				System.out.println("| Metric (kg, grams, mg) |");
				System.out.println("| Back                   |");
				System.out.println(" -----------------------");
				String Grams2 = G2.nextLine();
				if (Grams2.equals("I"))
				{
					G2I();
				}
				if (Grams2.equals("M"))
				{
					G2M();
				}
				if (Grams2.equals("B"))
				{
					Metric();
				}
				G2.close();
			}
			public void M2()
			{
				Scanner M2 = new Scanner(System.in);
				System.out.println("What are you trying to find? (You have Milligrams)");
				System.out.println(" -----------------------");
				System.out.println("| Imperial (lbs, ounces) |");
				System.out.println("| Metric (kg, grams, mg) |");
				System.out.println("| Back                   |");
				System.out.println(" -----------------------");
				String Milli2 = M2.nextLine();
				if (Milli2.equals("I"))
				{
					M2I();
				}
				if (Milli2.equals("M"))
				{
					M2M();
				}
				if (Milli2.equals("B"))
				{
					Metric();
				}
				M2.close();
			}
				public void K2I()
				{
					System.out.println("What do you want to find?");
					System.out.println(" ---------");
					System.out.println("| Pounds  |");
					System.out.println("| Ounces  |");
					System.out.println("| Back    |");
					System.out.println("| Restart |");
					System.out.println(" ---------");
					Scanner PandO;
					PandO = new Scanner(System.in);
					String typeI = PandO.nextLine();
					if (typeI.equals("P"))
						{
						K2lbs();
						}
					if (typeI.equals("O"))
					{
						K2oz();
					}
					if (typeI.equals("B"))
					{
						K2();
					}
					if (typeI.equals("R"))
					{
						start();
					}
					PandO.close();
				}
				public void M2I()
				{
					System.out.println("What do you want to find?");
					System.out.println(" ---------");
					System.out.println("| Pounds  |");
					System.out.println("| Ounces  |");
					System.out.println("| Back    |");
					System.out.println("| Restart |");
					System.out.println(" ---------");
					Scanner PandO;
					PandO = new Scanner(System.in);
					String typeI = PandO.nextLine();
					if (typeI.equals("P"))
						{
						Mi2lbs();
						}
					if (typeI.equals("O"))
					{
						Mi2oz();
					}
					if (typeI.equals("B"))
					{
						M2();
					}
					if (typeI.equals("R"))
					{
						start();
					}
					PandO.close();
				}
				public void G2I()
				{
					System.out.println("What do you want to find?");
					System.out.println(" ---------");
					System.out.println("| Pounds  |");
					System.out.println("| Ounces  |");
					System.out.println("| Back    |");
					System.out.println("| Restart |");
					System.out.println(" ---------");
					Scanner PandO;
					PandO = new Scanner(System.in);
					String typeI = PandO.nextLine();
					if (typeI.equals("P"))
						{
						G2lbs();
						}
					if (typeI.equals("O"))
					{
						G2oz();
					}
					if (typeI.equals("B"))
					{
						G2();
					}
					if (typeI.equals("R"))
					{
						start();
					}
					PandO.close();
				}
					public void K2lbs()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ---------------------------------");
						System.out.println("| How many Kilograms do you have? |");
						System.out.println("| Back                            |");
						System.out.println("| Restart                         |");
						System.out.println(" ---------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Kilograms = " + lbs2g*2.204622622 + " Pounds");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							K2I();
						}
						lbs.close();
					}
					public void K2oz()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ---------------------------------");
						System.out.println("| How many Kilograms do you have? |");
						System.out.println("| Back                            |");
						System.out.println("| Restart                         |");
						System.out.println(" ---------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Kilograms = " + lbs2g*2.204622622*16 + " Ounces");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							K2I();
						}
						lbs.close();
					}
					public void G2lbs()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println("| Back                        |");
						System.out.println("| Restart                     |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Grams = " + lbs2g*0.002204622622 + " Pounds");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							G2I();
						}
						lbs.close();
					}
					public void G2oz()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println("| Back                        |");
						System.out.println("| Restart                     |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Grams = " + lbs2g*0.002204622622*16 + " Ounces");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							G2I();
						}
						lbs.close();
					}
					public void Mi2lbs()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Milligrams do you have? |");
						System.out.println("| Back                             |");
						System.out.println("| Restart                          |");
						System.out.println(" ----------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Milligrams = " + lbs2g*0.000002204622622 + " Pounds");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							M2I();
						}
						lbs.close();
					}
					public void Mi2oz()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Milligrams do you have? |");
						System.out.println("| Back                             |");
						System.out.println("| Restart                          |");
						System.out.println(" ----------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Milligrams = " + lbs2g/0.000002204622622*16 + " Ounces");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							M2I();
						}
						lbs.close();
					}
					
				public void K2M()
				{
					System.out.println("Whatare you trying to find? (you have Kilograms)");
					System.out.println(" ------------");
					System.out.println("| Grams      |");
					System.out.println("| Milligrams |");
					System.out.println("| Back       |");
					System.out.println(" ------------");
					Scanner K2;
					K2 = new Scanner(System.in);
					//CT = conversion type
					String CT = K2.nextLine();
					if (CT.equals("G"))
					{
						K2G();
					}
					if (CT.equals("M"))
					{
						K2Mi();
					}
					if (CT.equals("B"))
					{
						K2();
					}
					
					
					K2.close();
				}
				public void G2M()
				{
					System.out.println("Whatare you trying to find? (You have Grams)");
					System.out.println(" ------------");
					System.out.println("| Kilograms  |");
					System.out.println("| Milligrams |");
					System.out.println("| Back       |");
					System.out.println(" ------------");
					Scanner G2;
					G2 = new Scanner(System.in);
					//CT = conversion type
					String CT = G2.nextLine();
					if (CT.equals("K"))
					{
						G2K();
					}
					if (CT.equals("M"))
					{
						G2Mi();
					}
					if (CT.equals("B"))
					{
						G2();
					}
					
					
					G2.close();
				}
				public void M2M()
				{
					System.out.println("Whatare you trying to find? (You have Milligrams)");
					System.out.println(" ------------");
					System.out.println("| Kilograms  |");
					System.out.println("| Grams      |");
					System.out.println("| Back       |");
					System.out.println(" ------------");
					Scanner Mi2;
					Mi2 = new Scanner(System.in);
					//CT = conversion type
					String CT = Mi2.nextLine();
					if (CT.equals("K"))
					{
						Mi2K();
					}
					if (CT.equals("G"))
					{
						Mi2G();
					}
					if (CT.equals("B"))
					{
						M2();
					}
					
					
					Mi2.close();
				}
					public void K2G()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ---------------------------------");
						System.out.println("| How many Kilograms do you have? |");
						System.out.println("| Back                            |");
						System.out.println("| Restart                         |");
						System.out.println(" ---------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Kilograms = " + lbs2g*1000 + " Grams");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							K2M();
						}
						lbs.close();
					}
					public void K2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ---------------------------------");
						System.out.println("| How many Kilograms do you have? |");
						System.out.println("| Back                            |");
						System.out.println("| Restart                         |");
						System.out.println(" ---------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Kilograms = " + lbs2g*100000 + " Milligrams");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							K2M();
						}
						lbs.close();
					}
					public void G2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println("| Back                        |");
						System.out.println("| Restart                     |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Grams = " + lbs2g/1000 + " Kilograms");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							G2M();
						}
						lbs.close();
					}
					public void G2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println("| Back                        |");
						System.out.println("| Restart                     |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Grams = " + lbs2g*100 + " Milligrams");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							G2M();
						}
						lbs.close();
					}
					public void Mi2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println("| Back                        |");
						System.out.println("| Restart                     |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Milligrams = " + lbs2g/100000 + " Kilograms");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							M2M();
						}
						lbs.close();
					}
					public void Mi2G()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println("| Back                        |");
						System.out.println("| Restart                     |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Milligrams = " + lbs2g/100 + " Grams");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							M2M();
						}
						lbs.close();
					}
			
		public void Imperial()
		{
			System.out.println("What do you have?");
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
				O2.close();
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
					System.out.println(ounces2lbs + " oz = " + ounces2lbs/16 + " lbs");
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
					System.out.println("What do you want to find?");
					System.out.println(" ------------");
					System.out.println("| Kilograms  |");
					System.out.println("| Grams      |");
					System.out.println("| Milligrams |");
					System.out.println("| Back       |");
					System.out.println(" ------------");
					Scanner KGM;
					KGM = new Scanner(System.in);
					String typeI = KGM.nextLine();
					if (typeI.equals("K"))
					{
						O2K();
					}
					if (typeI.equals("G"))
					{
						O2G();
					}
					if (typeI.equals("M"))
					{
						O2Mi();
					}
					if (typeI.equals("B"))
					{
						Ounces2();
					}
					KGM.close();
				}
				public void P2I()
				{
					Scanner lbs = new Scanner(System.in);
					System.out.println(" ------------------------------");
					System.out.println("| How many Pounds do you have? |");
					System.out.println("| Back                         |");
					System.out.println("| Restart                      |");
					System.out.println(" ------------------------------");
					double lbs2oz;
					lbs2oz = lbs.nextDouble();
					System.out.println(lbs2oz + " lbs = " + lbs2oz*16 + " Ounces");
					System.out.println("RESTART?");
					String restart;
					restart = lbs.next();
					if (restart.equals("R"))
					{
						start();
					}
					if (restart.equals("B"))
					{
						Pounds2();
					}
					lbs.close();
				
				}
				public void P2M()
				{
					System.out.println("What do you want to find?");
					System.out.println(" ------------");
					System.out.println("| Kilograms  |");
					System.out.println("| Grams      |");
					System.out.println("| Milligrams |");
					System.out.println("| Back       |");
					System.out.println(" ------------");
					Scanner KGM;
					KGM = new Scanner(System.in);
					String typeI = KGM.nextLine();
					if (typeI.equals("K"))
					{
						P2K();
					}
					if (typeI.equals("G"))
					{
						P2G();
					}
					if (typeI.equals("M"))
					{
						P2Mi();
					}
					if (typeI.equals("B"))
					{
						Pounds2();
					}
					KGM.close();
				}
					public void P2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Pounds do you have? |");
						System.out.println("| Back                         |");
						System.out.println("| Restart                      |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Pounds = " + lbs2g/2.204622622 + " Kilograms");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							P2M();
						}
						lbs.close();
					}
					public void P2G()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Pounds do you have? |");
						System.out.println("| Back                         |");
						System.out.println("| Restart                      |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " lbs = " + lbs2g/0.002204622622 + " Grams");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							P2M();
						}
						lbs.close();
					}
					public void P2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Pounds do you have? |");
						System.out.println("| Back                         |");
						System.out.println("| Restart                      |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " lbs = " + lbs2g/0.00002204622622 + " Milligrams");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							P2M();
						}
						lbs.close();
					}
					public void O2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Ounces do you have? |");
						System.out.println("| Back                         |");
						System.out.println("| Restart                      |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Ounces = " + (lbs2g*16)/2.204622622 + " Kilograms");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							O2M();
						}
						lbs.close();
					}
					public void O2G()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Ounces do you have? |");
						System.out.println("| Back                         |");
						System.out.println("| Restart                      |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Ounces = " + (lbs2g*16)/0.00204622622 + " Grams");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							O2M();
						}
						lbs.close();
					}
					public void O2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Ounces do you have? |");
						System.out.println("| Back                         |");
						System.out.println("| Restart                      |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Ounces = " + (lbs2g*16)/0.00000204622622 + " Milligrams");
						System.out.println("RESTART?");
						String restart;
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							O2M();
						}
						lbs.close();
					}
}

		


