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

	static ArrayList<String> countries = new ArrayList<>();
	
	public String readCountries()
	{
		
		
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
		File ourNewFile = ourNewPath.toFile();
		
		try(
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ourNewFile, true))))
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

	public void deleteCountries()
	{

		Path ourNewPath = Paths.get("\\Users\\admin\\newWorkspace\\ssa.tiy.week3.day10.august15\\src\\com\\ssa\\tiy\\assignment\\adventure\\countryListAdventure");
		File aNewfile = ourNewPath.toFile();
		
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewfile))))
			{
					out.print(countries.get(0));
					out.close();
			}
		catch (IOException e)
			{
					e.printStackTrace();
			}
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewfile, true))))
			{
				for (int i = 0; i < (countries.size())-1; i++)
				{
					out.print(countries.get(i));
				}
				out.close();
			} 
		
		catch (Exception e)
			{
				e.printStackTrace();
			}

	}
	public void deleteLastCountryFromArray()
	{
		countries.remove(countries.size() - 1);
		countries.trimToSize();
	}
	
}
