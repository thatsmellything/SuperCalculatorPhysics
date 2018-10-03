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
					System.out.println("Whatare you trying to find? (you have Kilograms)");
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
					System.out.println("Whatare you trying to find? (You have Grams)");
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
				
			}
			public void PeOz()
			{
				
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
			
		}
		public void DCM2()
		{
			
		}
			public void DCM2M()
			{
				
			}
			public void DCM2I()
			{
				
			}
			public void DCI2I()
			{
				
			}
			public void DCI2M()
			{
				
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
}

		


