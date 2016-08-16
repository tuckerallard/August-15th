package com.ssa.tiy.assignment.adventure;

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
		String removeCountry = null;
		Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\ssa.tiy.week3.day10.august15\\src\\com\\ssa\\tiy\\assignment\\adventure\\countryListAdventure");
		File aNewFile = ourNewPath.toFile();
		
		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile)))
		{
			String aCountry;
			while((aCountry = in.readLine()) != null)
			{
				ReadAndWrite.countries.add(aCountry);
			}
			in.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	
		while(unitedNations = true)
		{
				
		
			do
			{
				System.out.println("\nPlease choose 1, 2, or 3 to continue:\n"
					+"\n\t 1) Display all countries within the file."
					+"\n\t 2) Enter a country to add to the file."
					+"\n\t 3) Delete a country."
					+"\n\t 4) Exit the application.");
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
				ReadAndWrite delete = new ReadAndWrite();
				delete.deleteCountries();
				ReadAndWrite deleteArray = new ReadAndWrite();
				deleteArray.deleteLastCountryFromArray();
//				System.out.println("Previous country entered was deleted!");
//				ReadAndWrite displayTwo = new ReadAndWrite();
//				displayTwo.deleteLastCountryFromArray();
				break;
			case "4": 
				System.out.println("Goodbye!");
				System.exit(0);
				break;
	
			default: System.out.println("Try again.");
				break;
			}		
		
		}//main

	}

}//class