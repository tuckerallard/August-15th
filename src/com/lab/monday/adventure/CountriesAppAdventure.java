package com.lab.monday.adventure;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class CountriesAppAdventure
{
	private static boolean unitedNations = true;
	public static void main(String[] args)
	{
		Scanner map = new Scanner(System.in);
		String menuChoice = null;
		String userCountry = null;
		String countryList = null;
		String userConfirmation = null;
		String yesNoChoice = null;
		String removeCountry = null;
		Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\ssa.tiy.week3.day10.august15\\src\\com\\lab\\monday\\adventure\\countryList");
		File aNewFile = ourNewPath.toFile();
		
		try (BufferedReader in = new BufferedReader(new FileReader(aNewFile)))
		{
			String aCountry;
			while((aCountry = in.readLine()) != null)
			{
				ReadAndWriteAdventure.countries.add(aCountry);
			}
			in.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		while (unitedNations == true)
		{
			System.out.println();
			System.out.println("Welcome to our working list of countries.");
			
			do
			{
				System.out.println("To select an option, please use the menu below:");
				System.out.println("\n\t 1. Display countries."
				+ "\n\t 2. Add a country."
				+ "\n\t 3. Delete the last country entered"
				+ "\n\t 4. Exit application");
				menuChoice = map.nextLine();
			}
			while (ValidationAdventure.isValidMenuChoice(menuChoice));
		
			switch(menuChoice)
			{
				case "1":
					ReadAndWriteAdventure display = new ReadAndWriteAdventure();
					System.out.print("Here is the list you requested\n1");
					display.readCountries();
				break;
				
				case "2":
					System.out.print("Please enter the name of the country you wish to add to our working list.");
					userCountry = map.nextLine();
					ReadAndWriteAdventure addCountry = new ReadAndWriteAdventure();
					addCountry.writeCountries(userCountry);
				break;
				
				case "3":
					System.out.print("Are you sure you wish to delete the last country entered in working list of countries?");
					
					System.out.println("Please enter yes or no."
							+ "\n\tYes"
							+ "\n\tNo");
					userConfirmation = map.nextLine();
					if(userConfirmation.equalsIgnoreCase("yes"))
					{
						ReadAndWriteAdventure delete = new ReadAndWriteAdventure();
						delete.deleteCountries();
						ReadAndWriteAdventure deleteArray = new ReadAndWriteAdventure();
						deleteArray.deleteLastCountryFromArray();
					}
					else if (userConfirmation.equalsIgnoreCase("no"))
					{
						System.out.println("Glad we double-checked.");
					}	
					
					/*for(int i=0;i<ReadAndWriteAdventure.countries.size(); i++){
						System.out.println(ReadAndWriteAdventure.countries.get(i));
					}*/
				break;
				
				case "4":
					System.out.println("Goodbye!");
					System.exit(0);
			}//switch		
		}//while	
	}//main
}//class