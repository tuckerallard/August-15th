package com.ssa.tiy.assignment.adventure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReadAndWrite
{
	public String readCountries()
	{
		ArrayList<String> countries = new ArrayList<>();
		
		Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\ssa.tiy.week3.day10.august15\\src\\com\\ssa\\tiy\\assignment\\adventure\\countryListAdventure");
		File ourNewFile = ourNewPath.toFile();
		
		try (BufferedReader in = new BufferedReader(new FileReader(ourNewFile)))
		{
			String aCountry;
			while((aCountry = in.readLine())!= null)
			{
				countries.add(aCountry);
				
			}
			in.close();
		} 
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		for (int i = 0; i < countries.size(); i++)
		{
			System.out.println(countries.get(i));
		}

		return null;
	}
	
	public String writeCountries(String userCountry)
	{
		Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\ssa.tiy.week3.day10.august15\\src\\com\\ssa\\tiy\\assignment\\adventure\\countryListAdventure");
		File aNewfile = ourNewPath.toFile();
		
		try(
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewfile, true))))
			{
				out.print(userCountry);
				out.close();
			}
		catch (IOException e)
			{
				e.printStackTrace();
			}
		return null;
	}
	
	
}
