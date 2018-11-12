package controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class PhysicsController
{

	public void start()
	{
		
		System.out.println("This is the super calculator Physics Version!");
		System.out.println("Please select what you want to find by typing the first letter, or first letters (multiple words) of the selection");
		System.out.println("Or press R at any time to restart the application");
		System.out.println(" ---------------------- ");
		System.out.println("| Weight Conversion    |");
		System.out.println("| Potential Energy     |");
		System.out.println("| Kinetic Energy       |");
		System.out.println("| Distance Conversion  |");
		System.out.println(" ---------------------- ");
		Scanner inputScanner = new Scanner(System.in);
		int x=0;
		do {
		String answer = inputScanner.nextLine();
		if (answer.equals("WC"))
		{
			weightConversion();
		}
		if (answer.equals("PE"))
		{
			potentialEnergy();
		}
		if (answer.equals("KE"))
		{
			kineticEnergy();
		}
		if (answer.equals("DC"))
		{
			distanceConversion();
		}
		if (answer.equals("DEV"))
		{
			DEV();
		}
		} while (x < 10);
		start();
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
		int x=0;
		do {
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
		if(have.equals("R"))
		{
			start();
		}
		} while (x<10);
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
			int x = 0;
			do {
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
			if (typeI.equals("R"))
			{
				start();
			}
			}while (x<10);
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
				int x = 0;
				do {
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
				if  (Kilo2.equals("R"))
				{
					start();
				}
				}while (x<10);
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
				int x = 0;
				do {
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
				if (Grams2.equals("R"))
				{
					start();
				}
				}while (x<10);
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
				int x = 0;
				do {
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
				if (Milli2.equals("R"))
				{
					start();
				}
				}while (x<10);
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
					int x = 0;
					do {
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
					}while (x<10);
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
					int x = 0;
					do {
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
					}while(x<10);
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
					int x = 0;
					do {
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
					}while(x<10);
					PandO.close();
				}
					public void K2lbs()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ---------------------------------");
						System.out.println("| How many Kilograms do you have? |");
						System.out.println(" ---------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Kilograms = " + lbs2g*2.204622622 + " Pounds");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x = 0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							K2I();
						}
						}while (x<10);
						lbs.close();
					}
					public void K2oz()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ---------------------------------");
						System.out.println("| How many Kilograms do you have? |");
						System.out.println(" ---------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Kilograms = " + lbs2g*2.204622622*16 + " Ounces");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							K2I();
						}
						}while (x<1);
						lbs.close();
					}
					public void G2lbs()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Grams = " + lbs2g*0.002204622622 + " Pounds");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							G2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void G2oz()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Grams = " + lbs2g*0.002204622622*16 + " Ounces");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							G2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void Mi2lbs()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Milligrams do you have? |");
						System.out.println(" ----------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Milligrams = " + lbs2g*0.000002204622622 + " Pounds");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							M2I();
						}
						}while(x<2);
						lbs.close();
					}
					public void Mi2oz()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Milligrams do you have? |");
						System.out.println(" ----------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ "Milligrams = " + lbs2g/0.000002204622622*16 + " Ounces");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							M2I();
						}
						}while(x<3);
						lbs.close();
					}
					
				public void K2M()
				{
					System.out.println("What are you trying to find? (you have Kilograms)");
					System.out.println(" ------------");
					System.out.println("| Grams      |");
					System.out.println("| Milligrams |");
					System.out.println("| Back       |");
					System.out.println(" ------------");
					Scanner K2;
					K2 = new Scanner(System.in);
					//CT = conversion type
					int x =0;
					do {
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
					if (CT.equals("R"))
					{
						start();
					}
					}while(x<2);
					K2.close();
				}
				public void G2M()
				{
					System.out.println("What are you trying to find? (You have Grams)");
					System.out.println(" ------------");
					System.out.println("| Kilograms  |");
					System.out.println("| Milligrams |");
					System.out.println("| Back       |");
					System.out.println(" ------------");
					Scanner G2;
					G2 = new Scanner(System.in);
					//CT = conversion type
					int x =0;
					do {
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
					if (CT.equals("R"))
					{
						start();
					}
					}while(x<3);
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
					int x =0;
					do {
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
					if (CT.equals("R"))
					{
						start();
					}
					}while(x<3);
					Mi2.close();
				}
					public void K2G()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ---------------------------------");
						System.out.println("| How many Kilograms do you have? |");
						System.out.println(" ---------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Kilograms = " + lbs2g*1000 + " Grams");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							K2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void K2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ---------------------------------");
						System.out.println("| How many Kilograms do you have? |");
						System.out.println(" ---------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Kilograms = " + lbs2g*100000 + " Milligrams");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							K2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void G2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Grams = " + lbs2g/1000 + " Kilograms");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							G2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void G2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Grams = " + lbs2g*100 + " Milligrams");
						
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							G2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void Mi2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Milligrams = " + lbs2g/100000 + " Kilograms");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							M2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void Mi2G()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" -----------------------------");
						System.out.println("| How many Grams do you have? |");
						System.out.println(" -----------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Milligrams = " + lbs2g/100 + " Grams");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							M2M();
						}
						}while(x<1);
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
			int x =0;
			do {
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
			if (typeI.equals("R"))
			{
				start();
			}
			}while(x<1);
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
				int x =0;
				do {
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
				if (ouncesToo.equals("R"))
				{
					start();
				}
				}while(x<1);
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
				int x =0;
				do {
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
				if (poundsToo.equals("R"))
				{
					start();
				}
				}while(x<1);
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
					int x =0;
					do {
					restart = ounces.next();
					if (restart.equals("R"))
					{
						start();
					}
					}while(x<1);
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
					int x =0;
					do {
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
					if (typeI.equals("R"))
					{
						start();
					}
					}while(x<1);
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
					int x =0;
					do {
					restart = lbs.next();
					if (restart.equals("R"))
					{
						start();
					}
					if (restart.equals("B"))
					{
						Pounds2();
					}
					}while(x<1);
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
					int x =0;
					do {
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
					if (typeI.equals("R"))
					{
						start();
					}
					}while(x<1);
					KGM.close();
				}
					public void P2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Pounds do you have? |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Pounds = " + lbs2g/2.204622622 + " Kilograms");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							P2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void P2G()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Pounds do you have? |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " lbs = " + lbs2g/0.002204622622 + " Grams");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							P2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void P2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Pounds do you have? |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " lbs = " + lbs2g/0.00002204622622 + " Milligrams");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							P2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void O2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Ounces do you have? |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Ounces = " + (lbs2g*16)/2.204622622 + " Kilograms");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							O2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void O2G()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Ounces do you have? |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Ounces = " + (lbs2g*16)/0.00204622622 + " Grams");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							O2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void O2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Ounces do you have? |");
						System.out.println(" ------------------------------");
						double lbs2g;
						lbs2g = lbs.nextDouble();
						System.out.println(lbs2g+ " Ounces = " + (lbs2g*16)/0.00000204622622 + " Milligrams");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							O2M();
						}
						}while(x<1);
						lbs.close();
					}
					
					
					
	public void potentialEnergy()
	{
		Scanner weightScanner = new Scanner(System.in);
		System.out.println("What do you have?");
		System.out.println(" -----------------------");
		System.out.println("| Imperial (lbs, ounces) |");
		System.out.println("| Metric (kg, grams, mg) |");
		System.out.println("| Back                   |");
		System.out.println(" -----------------------");
		int x = 0;
		do {
		String have = weightScanner.next();
		
		if (have.equals("I"))
			{
			PEImperial();
			}
		if (have.equals("M"))
		{
			PEMetric();
		}
		if(have.equals("B"))
		{
			start();
		}
		} while (x<3);
		weightScanner.close();
	}
		public void PEMetric()
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
			int x = 0;
			do {
			String typeI = KGM.nextLine();
			if (typeI.equals("K"))
			{
				PeK();
			}
			if (typeI.equals("G"))
			{
				PeG();
			}
			if (typeI.equals("M"))
			{
				PeM();
			}
			if (typeI.equals("B"))
			{
				potentialEnergy();
			}
			if (typeI.equals("R"))
			{
				start();
			}
			} while (x<3);
			KGM.close();
		}
		public void PEImperial()
		{
			System.out.println("What do you have?");
			System.out.println(" --------");
			System.out.println("| Pounds |");
			System.out.println("| Ounces |");
			System.out.println("| Back   |");
			System.out.println(" --------");
			Scanner PandO;
			PandO = new Scanner(System.in);
			int x = 0;
			do {
			String typeI = PandO.nextLine();			
			if (typeI.equals("P"))
				{
				PeLbs();
				}
			if (typeI.equals("O"))
			{
				PeOz();
			}
			if (typeI.equals("B"))
			{
				potentialEnergy();
			}
			if (typeI.equals("R"))
			{
				start();
			}
			} while (x<3);
			PandO.close();
			
		}
			public void PeK() 
			{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ---------------------------------");
				System.out.println("| How many Kilograms do you have  |");
				System.out.println(" ---------------------------------");
				boolean validInputNum = false;
				double KG = 0;
				while(!validInputNum)
				{
					try
					{
						KG = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				
				System.out.println(" -------------------------------------");
				System.out.println("| How high (in meters) is the object? |");
				System.out.println(" -------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double g = (9.8*speed);
				double joules = (KG)*g; 
				System.out.println(KG+ " Kilograms at " + speed + "m high, has " + joules +  " Joules of potential energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					PEMetric();
				}
				} while (x<3);
				lbs.close();
			}
			public void PeG()
			{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ---------------------------------");
				System.out.println("| How many Grams do you have?     |");
				System.out.println(" ---------------------------------");
				boolean validInputNum = false;
				double KG = 0;
				while(!validInputNum)
				{
					try
					{
						KG = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				
				System.out.println(" -------------------------------------");
				System.out.println("| How high (in meters) is the object? |");
				System.out.println(" -------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double g = (9.8*speed);
				double joules = (KG/1000)*g; 
				System.out.println(KG+ " Grams at " + speed + "m high, has " + joules +  " Joules of potential energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					PEMetric();
				}
				} while (x<3);
				lbs.close();
			}
			public void PeM()
			{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ----------------------------------");
				System.out.println("| How many Milligrams do you have? |");
				System.out.println(" ----------------------------------");
				boolean validInputNum = false;
				double KG = 0;
				while(!validInputNum)
				{
					try
					{
						KG = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				
				System.out.println(" -------------------------------------");
				System.out.println("| How high (in meters) is the object? |");
				System.out.println(" -------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double g = (9.8*speed);
				double joules = (KG/1000000)*g; 
				System.out.println(KG+ " Milligrams at " + speed + "m high, has " + joules +  " Joules of potential energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					PEMetric();
				}
				} while (x<3);
				lbs.close();
			}
			public void PeLbs()
			{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ------------------------------");
				System.out.println("| How many Pounds do you have? |");
				System.out.println(" ------------------------------");
				boolean validInputNum = false;
				double lbs2g = 0;
				while(!validInputNum)
				{
					try
					{
						lbs2g = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double P2K = lbs2g/2.204622622;
				System.out.println(" --------------------------------------------");
				System.out.println("| How high (in meters) is the object moving? |");
				System.out.println(" --------------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double g = (9.8*speed);
				double joules = (P2K)*g; 
				System.out.println(P2K+ " Pounds at " + speed + "m high, has " + joules +  " Joules of potential energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					KEImperial();
				}
				} while (x<3);
				lbs.close();
				
			}
			public void PeOz()
			{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ------------------------------");
				System.out.println("| How many Ounces do you have? |");
				System.out.println(" ------------------------------");
				boolean validInputNum = false;
				double lbs2g = 0;
				while(!validInputNum)
				{
					try
					{
						lbs2g = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double P2K = lbs2g/2.204622622/16;
				System.out.println(" -------------------------------------");
				System.out.println("| How high (in meters) is the object? |");
				System.out.println(" -------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double g = (9.8*speed);
				double joules = (P2K)*g; 
				System.out.println(P2K+ " Ounces at " + speed + "m high, has " + joules +  " Joules of potential energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					KEImperial();
				}
				} while (x<3);
				lbs.close();
				
			}
		
	
	
	
	public void kineticEnergy()
	{
		Scanner weightScanner = new Scanner(System.in);
		System.out.println("What do you have?");
		System.out.println(" -----------------------");
		System.out.println("| Imperial (lbs, ounces) |");
		System.out.println("| Metric (kg, grams, mg) |");
		System.out.println("| Back                   |");
		System.out.println(" -----------------------");
		int x = 0;
		do {
		String have = weightScanner.next();
		
		if (have.equals("I"))
			{
			KEImperial();
			}
		if (have.equals("M"))
		{
			KEMetric();
		}
		if(have.equals("B"))
		{
			start();
		}
		} while (x<3);
		weightScanner.close();
	}
		public void KEMetric()
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
		int x = 0;
		do {
		String typeI = KGM.nextLine();
		if (typeI.equals("K"))
		{
			KeK();
		}
		if (typeI.equals("G"))
		{
			KeG();
		}
		if (typeI.equals("M"))
		{
			KeM();
		}
		if (typeI.equals("B"))
		{
			kineticEnergy();
		}
		if (typeI.equals("R"))
		{
			start();
		}
		} while (x<3);
		KGM.close();
	}
		public void KEImperial()
		{
			System.out.println("What do you have?");
			System.out.println(" --------");
			System.out.println("| Pounds |");
			System.out.println("| Ounces |");
			System.out.println("| Back   |");
			System.out.println(" --------");
			Scanner PandO;
			PandO = new Scanner(System.in);
			int x = 0;
			do {
			String typeI = PandO.nextLine();			
			if (typeI.equals("P"))
				{
				KeLbs();
				}
			if (typeI.equals("O"))
			{
				KeOz();
			}
			if (typeI.equals("B"))
			{
				kineticEnergy();
			}
			if (typeI.equals("R"))
			{
				start();
			}
			} while (x<3);
			PandO.close();
			
			
		}
			public void KeK()
		{
			Scanner lbs = new Scanner(System.in);
			System.out.println(" ---------------------------------");
			System.out.println("| How many Kilograms do you have? |");
			System.out.println(" ---------------------------------");
			boolean validInputNum = false;
			double KG = 0;
			while(!validInputNum)
			{
				try
				{
					KG = lbs.nextDouble();
					validInputNum=true;
				}
				catch (InputMismatchException e)
				{
					System.out.println("Please enter a number");
					lbs.nextLine();
				}
			}
			System.out.println(" --------------------------------------------");
			System.out.println("| How fast (in meters) is the object moving? |");
			System.out.println(" --------------------------------------------");
			boolean validInputSp = false;
			double speed = 0;
			while(!validInputSp)
			{
				try
				{
					speed = lbs.nextDouble();
					validInputSp=true;
				}
				catch (InputMismatchException e)
				{
					System.out.println("Please enter a number");
					lbs.nextLine();
				}
			}
			double joules = .5*(KG)*(speed*speed); 
			System.out.println(KG+ " Kilograms moving at " + speed + " Meters a second, is equivelent to " + joules +  " Joules of kinetic energy");
			System.out.println(" ---------");
			System.out.println("| Back    |");
			System.out.println("| Restart |");
			System.out.println(" ---------");
			System.out.println("RESTART?");
			String restart;
			int x = 0;
			do {
			restart = lbs.next();
			if (restart.equals("R"))
			{
				start();
			}
			if (restart.equals("B"))
			{
				KEMetric();
			}
			} while (x<3);
			lbs.close();
		}
			public void KeG()
		{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ---------------------------------");
				System.out.println("| How many Grams do you have?     |");
				System.out.println(" ---------------------------------");
				boolean validInputNum = false;
				double KG = 0;
				while(!validInputNum)
				{
					try
					{
						KG = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				
				System.out.println(" --------------------------------------------");
				System.out.println("| How fast (in meters) is the object moving? |");
				System.out.println(" --------------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double joules = .5*(KG/1000)*(speed*speed); 
				System.out.println(KG+ " Grams moving at " + speed + " Meters a second, is equivelent to " + joules +  " Joules of kinetic energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					KEMetric();
				}
				} while (x<3);
				lbs.close();
		}
			public void KeM()
		{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" --------------------------------------");
				System.out.println("| How many Milligrams do you have?     |");
				System.out.println(" --------------------------------------");
				boolean validInputNum = false;
				double KG = 0;
				while(!validInputNum)
				{
					try
					{
						KG = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				
				System.out.println(" --------------------------------------------");
				System.out.println("| How fast (in meters) is the object moving? |");
				System.out.println(" --------------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double joules = .5*(KG/100000)*(speed*speed); 
				System.out.println(KG+ " Milligrams moving at " + speed + " Meters a second, is equivelent to " + joules +  " Joules of kinetic energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					KEMetric();
				}
				} while (x<3);
				lbs.close();
		}
			public void KeLbs()
		{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ------------------------------");
				System.out.println("| How many Pounds do you have? |");
				System.out.println(" ------------------------------");
				boolean validInputNum = false;
				double lbs2g = 0;
				while(!validInputNum)
				{
					try
					{
						lbs2g = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double P2K = lbs2g/2.204622622;
				System.out.println(" --------------------------------------------");
				System.out.println("| How fast (in meters) is the object moving? |");
				System.out.println(" --------------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double joules = .5*(P2K)*(speed*speed); 
				System.out.println(lbs2g+ " Pounds moving at " + speed + " Meters a second, is equivelent to " + joules +  " Joules of kinetic energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					KEImperial();
				}
				} while (x<3);
				lbs.close();
				
		}
			public void KeOz()
		{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ------------------------------");
				System.out.println("| How many Ounces do you have? |");
				System.out.println(" ------------------------------");
				boolean validInputNum = false;
				double lbs2g = 0;
				while(!validInputNum)
				{
					try
					{
						lbs2g = lbs.nextDouble();
						validInputNum=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double P2K = (lbs2g/16)/2.204622622;
				System.out.println(" --------------------------------------------");
				System.out.println("| How fast (in meters) is the object moving? |");
				System.out.println(" --------------------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				double joules = .5*(P2K)*(speed*speed); 
				System.out.println(lbs2g+ " Ounces moving at " + speed + " Meters a second, is equivelent to " + joules +  " Joules of kinetic energy");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x = 0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					KEImperial();
				}
				} while (x<3);
				lbs.close();
		}
		
	
			
	public void distanceConversion()
	{
		Scanner weightScanner = new Scanner(System.in);
		System.out.println("What do you have?");
		System.out.println(" --------------------------------");
		System.out.println("| Imperial (miles, feet, inches) |");
		System.out.println("| Metric (km, m, cm, mm)         |");
		System.out.println("| Back                           |");
		System.out.println(" --------------------------------");
		int x = 0;
		do {
		String have = weightScanner.next();
		
		if (have.equals("I"))
			{
			DCI2();
			}
		if (have.equals("M"))
		{
			DCM2();
		}
		if(have.equals("B"))
		{
			start();
		}
		} while (x<3);
		weightScanner.close();
	}
		public void DCI2()
		{
			System.out.println(" -----------------------------------------------------------------");
			System.out.println("| I am sorry but this feature is still under construction.        |");
			System.out.println("| All other functions are completed and working besides this one. |");
			System.out.println("| Please press 'B' then 'Enter' to go back.                       |");
			System.out.println(" -----------------------------------------------------------------");
			Scanner KGM;
			KGM = new Scanner(System.in);
			int x = 0;
			do {
			String typeI = KGM.nextLine();
			
			if (typeI.equals("B"))
			{
				distanceConversion();
			}
			if (typeI.equals("R"))
			{
				start();
			}
			}while (x<10);
			KGM.close();
		}
		public void DCM2()
		{
			System.out.println("What do you have?");
			System.out.println(" ------------------");
			System.out.println("| Kilometers       |");
			System.out.println("| Meters           |");
			System.out.println("| Centimeters      |");
			System.out.println("| Millimeters (MM) |");
			System.out.println("| Back             |");
			System.out.println(" ------------------");
			Scanner KGM;
			KGM = new Scanner(System.in);
			int x = 0;
			do {
			String typeI = KGM.nextLine();
			if (typeI.equals("K"))
			{
				DCK2();
			}
			if (typeI.equals("MM"))
			{
				DCMM2();
			}
			if (typeI.equals("M"))
			{
				DCMe2();
			}
			if (typeI.equals("C"))
			{
				DCC2();
			}
			if (typeI.equals("B"))
			{
				distanceConversion();
			}
			if (typeI.equals("R"))
			{
				start();
			}
			}while (x<10);
			KGM.close();
		}
			public void DCMe2()
			{
				Scanner K2 = new Scanner(System.in);
				System.out.println("What are you trying to find? (You have Meters)");
				System.out.println(" ---------------------------------------");
				System.out.println("| Imperial (Miles, Yards, Feet, Inches) |");
				System.out.println("| Metric (km, cm, mm)                   |");
				System.out.println("| Back                                  |");
				System.out.println(" ---------------------------------------");
				int x = 0;
				do {
				String Kilo2 = K2.nextLine();
				if (Kilo2.equals("I"))
				{
					DCMe2I();
				}
				if (Kilo2.equals("M"))
				{
					DCMe2M();
				}
				if (Kilo2.equals("B"))
				{
					DCM2();
				}
				if  (Kilo2.equals("R"))
				{
					start();
				}
				}while (x<10);
				K2.close();
				
			}
				public void DCMe2M()
			{
				System.out.println("What are you trying to find? (you have Meters)");
				System.out.println(" ------------------");
				System.out.println("| Kilometers       |");
				System.out.println("| Centimeters      |");
				System.out.println("| Millimeters (MM) |");
				System.out.println("| Back             |");
				System.out.println(" ------------------");
				Scanner K2;
				K2 = new Scanner(System.in);
				//CT = conversion type
				int x =0;
				do {
				String CT = K2.nextLine();
				if (CT.equals("K"))
				{
					DCMe2K();
				}
				if (CT.equals("M"))
				{
					DCMe2MM();
				}
				if(CT.equals("C"))
				{
					DCMe2C();
				}
				if (CT.equals("B"))
				{
					DCMe2();
				}
				if (CT.equals("R"))
				{
					start();
				}
				}while(x<2);
				K2.close();
			}
					public void DCMe2K()
			{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ------------------------------");
				System.out.println("| How many Meters do you have? |");
				System.out.println(" ------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				System.out.println(speed+ " Meters = " + speed/1000 + " Kilometers");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x =0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					DCMe2M();
				}
				}while(x<1);
				lbs.close();
			}
					public void DCMe2MM()
			{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Meters do you have? |");
						System.out.println(" ------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Meters = " + speed*100*10 + " Millimeters");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMe2M();
						}
						}while(x<1);
						lbs.close();
			}				
					public void DCMe2C()
				{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ------------------------------");
						System.out.println("| How many Meters do you have? |");
						System.out.println(" ------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Meters = " + speed*100 + " Centimeters");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMe2M();
						}
						}while(x<1);
						lbs.close();
				}	
				public void DCMe2I()
				{
					System.out.println("What do you want to find?");
					System.out.println(" ---------");
					System.out.println("| Miles   |");
					System.out.println("| Yards   |");
					System.out.println("| Feet    |");
					System.out.println("| Inches  |");
					System.out.println("| Back    |");
					System.out.println("| Restart |");
					System.out.println(" ---------");
					Scanner PandO;
					PandO = new Scanner(System.in);
					int x = 0;
					do {
					String typeI = PandO.nextLine();
					
					if (typeI.equals("M"))
						{
						DCMe2Mi();
						}
					if (typeI.equals("Y"))
					{
						DCMe2Y();
					}
					if (typeI.equals("F"))
					{
						DCMe2Ft();
					}
					if (typeI.equals("I"))
					{
						DCMe2In();
					}
					if (typeI.equals("B"))
					{
						DCMe2();
					}
					if (typeI.equals("R"))
					{
						start();
					}
					}while (x<10);
					PandO.close();	
				}					
					public void DCMe2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Meters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Meters = " + speed*0.6214/1000 + " Miles");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMe2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCMe2Y()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Meters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Meters = " + speed*0.6214/1000*1760 + " Yards");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMe2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCMe2Ft()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Meters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Meters = " + speed*0.6214/1000*1760*3 + " Feet");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMe2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCMe2In()
				{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Meters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Meters = " + speed*0.6214/1000*1760*3*12 + " Inches");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMe2I();
						}
						}while(x<1);
						lbs.close();
				}
			public void DCK2()
			{
				Scanner K2 = new Scanner(System.in);
				System.out.println("What are you trying to find? (You have Kilometers)");
				System.out.println(" ---------------------------------------");
				System.out.println("| Imperial (Miles, Yards, Feet, Inches) |");
				System.out.println("| Metric (km, cm, mm)                   |");
				System.out.println("| Back                                  |");
				System.out.println(" ---------------------------------------");
				int x = 0;
				do {
				String Kilo2 = K2.nextLine();
				if (Kilo2.equals("I"))
				{
					DCK2I();
				}
				if (Kilo2.equals("M"))
				{
					DCK2M();
				}
				if (Kilo2.equals("B"))
				{
					DCM2();
				}
				if  (Kilo2.equals("R"))
				{
					start();
				}
				}while (x<10);
				K2.close();
			}
				public void DCK2M()
			{
				System.out.println("Whatare you trying to find? (you have Kilometers)");
				System.out.println(" ------------------");
				System.out.println("| Meters           |");
				System.out.println("| Centimeters      |");
				System.out.println("| Millimeters (MM) |");
				System.out.println("| Back             |");
				System.out.println(" ------------------");
				Scanner K2;
				K2 = new Scanner(System.in);
				//CT = conversion type
				int x =0;
				do {
				String CT = K2.nextLine();
				if (CT.equals("M"))
				{
					DCK2Me();
				}
				if (CT.equals("MM"))
				{
					DCK2MM();
				}
				if(CT.equals("C"))
				{
					DCK2C();
				}
				if (CT.equals("B"))
				{
					DCK2();
				}
				if (CT.equals("R"))
				{
					start();
				}
				}while(x<2);
				K2.close();
			}
					public void DCK2Me()
			{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ----------------------------------");
				System.out.println("| How many Kilometers do you have? |");
				System.out.println(" ----------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				System.out.println(speed+ " Kilometers = " + speed*1000 + " Meters");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x =0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					DCK2M();
				}
				}while(x<1);
				lbs.close();
			}
					public void DCK2MM()
			{
				Scanner lbs = new Scanner(System.in);
				System.out.println(" ----------------------------------");
				System.out.println("| How many Kilometers do you have? |");
				System.out.println(" ----------------------------------");
				boolean validInputSp = false;
				double speed = 0;
				while(!validInputSp)
				{
					try
					{
						speed = lbs.nextDouble();
						validInputSp=true;
					}
					catch (InputMismatchException e)
					{
						System.out.println("Please enter a number");
						lbs.nextLine();
					}
				}
				System.out.println(speed+ " Kilometers = " + speed*1000*100*10 + " Millimeters");
				System.out.println(" ---------");
				System.out.println("| Back    |");
				System.out.println("| Restart |");
				System.out.println(" ---------");
				System.out.println("RESTART?");
				String restart;
				int x =0;
				do {
				restart = lbs.next();
				if (restart.equals("R"))
				{
					start();
				}
				if (restart.equals("B"))
				{
					DCK2M();
				}
				}while(x<1);
				lbs.close();
			}				
					public void DCK2C()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Kilometers do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Kilometers = " + speed*1000*100 + " Centimeters");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2M();
						}
						}while(x<1);
						lbs.close();
					}	
				public void DCK2I()
				{
					System.out.println("What do you want to find?");
					System.out.println(" ---------");
					System.out.println("| Miles   |");
					System.out.println("| Yards   |");
					System.out.println("| Feet    |");
					System.out.println("| Inches  |");
					System.out.println("| Back    |");
					System.out.println("| Restart |");
					System.out.println(" ---------");
					Scanner PandO;
					PandO = new Scanner(System.in);
					int x = 0;
					do {
					String typeI = PandO.nextLine();
					
					if (typeI.equals("M"))
						{
						DCK2Mi();
						}
					if (typeI.equals("Y"))
					{
						DCK2Ya();
					}
					if (typeI.equals("F"))
					{
						DCK2Ft();
					}
					if (typeI.equals("I"))
					{
						DCK2In();
					}
					if (typeI.equals("B"))
					{
						DCK2();
					}
					if (typeI.equals("R"))
					{
						start();
					}
					}while (x<10);
					PandO.close();		
				}					
					public void DCK2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Kilometers do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Kilometers = " + speed*0.6214 + " Miles");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCK2Ya()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Kilometers do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Kilometers = " + speed*0.6214*1760 + " Yards");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCK2Ft()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Kilometers do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Kilometers = " + speed*0.6214*1760*3 + " Feet");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCK2In()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Kilometers do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Kilometers = " + speed*0.6214*1760*3*12 + " Inches");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMe2I();
						}
						}while(x<1);
						lbs.close();
					}
			public void DCMM2()
			{
				Scanner K2 = new Scanner(System.in);
				System.out.println("What are you trying to find? (You have Millimeters)");
				System.out.println(" ---------------------------------------");
				System.out.println("| Imperial (Miles, Yards, Feet, Inches) |");
				System.out.println("| Metric (km, cm, mm)                   |");
				System.out.println("| Back                                  |");
				System.out.println(" ---------------------------------------");
				int x = 0;
				do {
				String Kilo2 = K2.nextLine();
				if (Kilo2.equals("I"))
				{
					DCMM2I();
				}
				if (Kilo2.equals("M"))
				{
					DCMM2M();
				}
				if (Kilo2.equals("B"))
				{
					DCM2();
				}
				if  (Kilo2.equals("R"))
				{
					start();
				}
				}while (x<10);
				K2.close();
			}
				public void DCMM2I()
				{
					System.out.println("What do you want to find?");
					System.out.println(" ---------");
					System.out.println("| Miles   |");
					System.out.println("| Yards   |");
					System.out.println("| Feet    |");
					System.out.println("| Inches  |");
					System.out.println("| Back    |");
					System.out.println("| Restart |");
					System.out.println(" ---------");
					Scanner PandO;
					PandO = new Scanner(System.in);
					int x = 0;
					do {
					String typeI = PandO.nextLine();
					
					if (typeI.equals("M"))
						{
						DCMM2Mi();
						}
					if (typeI.equals("Y"))
					{
						DCMM2Ya();
					}
					if (typeI.equals("F"))
					{
						DCMM2Ft();
					}
					if (typeI.equals("I"))
					{
						DCMM2In();
					}
					if (typeI.equals("B"))
					{
						DCMM2();
					}
					if (typeI.equals("R"))
					{
						start();
					}
					}while (x<10);
					PandO.close();		
				}
					public void DCMM2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Millimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Millimeters = " + speed*0.6214/1000/100/10 + " Miles");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMM2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCMM2Ya()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Millimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Millimeters = " + speed*0.6214/1000/100/10*1760 + " Yards");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMM2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCMM2Ft()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Millimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Millimeters = " + speed*0.6214/1000/100/10*1760*3 + " Feet");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMM2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCMM2In()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Millimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Millimeters = " + speed*0.6214/1000/100/10*1760*3*12 + " Inches");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCMM2I();
						}
						}while(x<1);
						lbs.close();
					}
				public void DCMM2M()
				{
					System.out.println("What are you trying to find? (you have Millimeters)");
					System.out.println(" ------------------");
					System.out.println("| Kilometers       |");
					System.out.println("| Meters           |");
					System.out.println("| Centimeters      |");
					System.out.println("| Back             |");
					System.out.println(" ------------------");
					Scanner K2;
					K2 = new Scanner(System.in);
					//CT = conversion type
					int x =0;
					do {
					String CT = K2.nextLine();
					if (CT.equals("M"))
					{
						DCMM2Me();
					}
					if (CT.equals("K"))
					{
						DCMM2K();
					}
					if(CT.equals("C"))
					{
						DCMM2C();
					}
					if (CT.equals("B"))
					{
						DCMM2();
					}
					if (CT.equals("R"))
					{
						start();
					}
					}while(x<2);
					K2.close();
				}
					public void DCMM2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Millimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Millimeters = " + speed/1000/100/10 + " Kilometers");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCMM2Me()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Millimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Millimeters = " + speed/100/10 + " Meters");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCMM2C()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Millimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Millimeters = " + speed/10 + " Centimeters");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2M();
						}
						}while(x<1);
						lbs.close();
					}
			public void DCC2()
			{
				Scanner K2 = new Scanner(System.in);
				System.out.println("What are you trying to find? (You have Centimeters)");
				System.out.println(" ---------------------------------------");
				System.out.println("| Imperial (Miles, Yards, Feet, Inches) |");
				System.out.println("| Metric (km, cm, mm)                   |");
				System.out.println("| Back                                  |");
				System.out.println(" ---------------------------------------");
				int x = 0;
				do {
				String Kilo2 = K2.nextLine();
				if (Kilo2.equals("I"))
				{
					DCC2I();
				}
				if (Kilo2.equals("M"))
				{
					DCC2M();
				}
				if (Kilo2.equals("B"))
				{
					DCM2();
				}
				if  (Kilo2.equals("R"))
				{
					start();
				}
				}while (x<10);
				K2.close();
			}
				public void DCC2M()
				{
					System.out.println("What are you trying to find? (you have Centimeters)");
					System.out.println(" ------------------");
					System.out.println("| Kilometers       |");
					System.out.println("| Meters           |");
					System.out.println("| Millimeters (MM) |");
					System.out.println("| Back             |");
					System.out.println(" ------------------");
					Scanner K2;
					K2 = new Scanner(System.in);
					//CT = conversion type
					int x =0;
					do {
					String CT = K2.nextLine();
					if (CT.equals("M"))
					{
						DCC2Me();
					}
					if (CT.equals("MM"))
					{
						DCC2MM();
					}
					if(CT.equals("K"))
					{
						DCC2K();
					}
					if (CT.equals("B"))
					{
						DCC2();
					}
					if (CT.equals("R"))
					{
						start();
					}
					}while(x<2);
					K2.close();
				}
					public void DCC2K()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Centimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Centimeters = " + speed/1000/100 + " Kilometers");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCC2Me()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Centimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Centimeters = " + speed/100 + " Meters");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2M();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCC2MM()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Centimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Centimeters = " + speed*10 + " Millimeters");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCK2M();
						}
						}while(x<1);
						lbs.close();
					}
				public void DCC2I()
				{
					System.out.println("What do you want to find?");
					System.out.println(" ---------");
					System.out.println("| Miles   |");
					System.out.println("| Yards   |");
					System.out.println("| Feet    |");
					System.out.println("| Inches  |");
					System.out.println("| Back    |");
					System.out.println("| Restart |");
					System.out.println(" ---------");
					Scanner PandO;
					PandO = new Scanner(System.in);
					int x = 0;
					do {
					String typeI = PandO.nextLine();
					
					if (typeI.equals("M"))
						{
						DCC2Mi();
						}
					if (typeI.equals("Y"))
					{
						DCC2Ya();
					}
					if (typeI.equals("F"))
					{
						DCC2Ft();
					}
					if (typeI.equals("I"))
					{
						DCC2In();
					}
					if (typeI.equals("B"))
					{
						DCC2();
					}
					if (typeI.equals("R"))
					{
						start();
					}
					}while (x<10);
					PandO.close();		
				}
					public void DCC2Mi()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Centimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Centimeters = " + speed*0.6214/1000/100 + " Miles");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCC2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCC2Ya()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Centimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Centimeters = " + speed*0.6214/1000/100*1760 + " Yards");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCC2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCC2Ft()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Centimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Centimeters = " + speed*0.6214/1000/100*1760*3 + " Feet");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCC2I();
						}
						}while(x<1);
						lbs.close();
					}
					public void DCC2In()
					{
						Scanner lbs = new Scanner(System.in);
						System.out.println(" ----------------------------------");
						System.out.println("| How many Centimeters do you have? |");
						System.out.println(" ----------------------------------");
						boolean validInputSp = false;
						double speed = 0;
						while(!validInputSp)
						{
							try
							{
								speed = lbs.nextDouble();
								validInputSp=true;
							}
							catch (InputMismatchException e)
							{
								System.out.println("Please enter a number");
								lbs.nextLine();
							}
						}
						System.out.println(speed+ " Centimeters = " + speed*0.6214/1000/100*1760*3*12 + " Inches");
						System.out.println(" ---------");
						System.out.println("| Back    |");
						System.out.println("| Restart |");
						System.out.println(" ---------");
						System.out.println("RESTART?");
						String restart;
						int x =0;
						do {
						restart = lbs.next();
						if (restart.equals("R"))
						{
							start();
						}
						if (restart.equals("B"))
						{
							DCC2I();
						}
						}while(x<1);
						lbs.close();
					}
			
					
					
				
			
			
			
			
			
			
			
			
	//--------Catch ERRORS------------
	public boolean validInt(String example)
	{
		boolean isValid = false;
		
		//Immediately assign create and make a value equal to something. then return that
		try
		{
			Integer.parseInt(example);
			isValid = true;
			
		}
		
		catch(NumberFormatException error)
		{
			System.out.println("Type in a valid number boi");
		}
		return isValid;
		//always put return at the bottom for the boolean or else you get red death
	}
	public boolean validDouble(String example)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only floating values are allowed for input");
		}
		
		return isValid;
	}
	public boolean validBool(String maybeBool)
	{
		boolean isValid = false;
		try
		{
			Boolean.parseBoolean(maybeBool);
			isValid = true;
		}
		catch(IllegalArgumentException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a boolean value IE true or false ");
		}
		return isValid;
	}
	public void DEV()
	{
		JOptionPane.showMessageDialog(null, "Imperial (lbs, ounces) Metric (kg, grams, mg) Back");
	}
}

		


