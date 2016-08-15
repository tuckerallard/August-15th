package com.ssa.tiy.practice;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class MyFavoriteBooks
{

	public static void main(String[] args)
	{
		ArrayList<String> erinsFavBooks = new ArrayList<>();
		
		Path ourNewPath = Paths.get("\\Users\\admin\\Desktop\\myfavbooks.txt");
		File ourNewFile = ourNewPath.toFile();
		
		try (BufferedReader in = new BufferedReader(new FileReader(ourNewFile)))
		{
			String aBook;
			while((aBook = in.readLine())!= null)
			{
				erinsFavBooks.add(aBook);
			}
			
		} 
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		for (int i = 0; i < erinsFavBooks.size(); i++)
		{
			System.out.println(erinsFavBooks.get(i));
		}
		
	}

}
