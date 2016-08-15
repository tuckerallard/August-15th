package com.ssa.tiy.assignment.Explorer;

public class Validation
{
	public static boolean isValidMenuChoice(String userSelection)
	{
		boolean validSelection = true;
		String[] validEntries = {"1", "2", "3"};
		
		
		for (int i = 0; i < validEntries.length; i++)
		{
			if (userSelection.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;
			}
		}
		if (validSelection)
		{
			System.out.println("This is not a valid entry. Please try again");
		}
		return validSelection;
				
	}
	
	
}
