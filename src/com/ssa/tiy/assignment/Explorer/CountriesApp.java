package com.ssa.tiy.assignment.Explorer;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;


public class CountriesApp
{

	private static boolean unitedNations = true;
		
	
	public static void main(String[] args)
	{
		Scanner map = new Scanner(System.in);
		String menuChoice = null;
		String userCountry = null;
	
		while(unitedNations = true)
		{
				
		
			do
			{
				System.out.println("\nPlease choose 1, 2, or 3 to continue:\n"
					+"\n\t 1) Display all countries within the file."
					+"\n\t 2) Enter a country to add to the file."
					+"\n\t 3) Exit the application.");
				menuChoice = map.nextLine();
			}
			while(Validation.isValidMenuChoice(menuChoice));
			
			switch (menuChoice)
			{
			case "1": 
				ReadAndWrite display = new ReadAndWrite();
				System.out.println("Here is the list you requested: \n");
				display.readCountries();
				break;
			case "2": 
				System.out.println("Please enter the name of the country:");
				userCountry = map.nextLine();
				ReadAndWrite addCountry = new ReadAndWrite();
				addCountry.writeCountries("\n" + userCountry);
				break;
			case "3": 
				System.out.println("Goodbye!");
				System.exit(0);
				break;
	
			default: System.out.println("Try again.");
				break;
			}		
		
		}//main

	}

}//class
