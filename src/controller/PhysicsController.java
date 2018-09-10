package controller;

import java.util.Scanner;

public class PhysicsController
{

	public void start()
	{
		System.out.print("This is the super calculator Physics Version!");
		System.out.println("Please select what you want to find by typing it exactly");
		System.out.println("Weight Conversion");
		System.out.println("Potential Energy");
		System.out.println("Kinetic Energy");
		System.out.println("Net Energy");
		Scanner inputScanner = new Scanner(System.in);
		String answer = inputScanner.nextLine();
		
		if (answer.equals("Weight Conversion"))
		{
			weightConversion();
		}
		if (answer.equals("Potential Energy"))
		{
			pEnergy();
		}
		
		if (answer.equals("Kinetic Energy"))
		{
			kEnergy();
		}
		
		if (answer.equals("Net Energy"))
		{
			nEnergy();
		}
		
	}
	
	public void weightConversion()
	{
		
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
