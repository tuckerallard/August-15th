package com.ssa.tiy.practice;

import java.io.*;
import java.nio.file.*;

public class OurWriter
{
	public static void main(String[] args)
	{
		Path ourNewPath = Paths.get("\\Users\\admin\\Desktop\\anewtextfile.txt");
		File aNewfileObj = ourNewPath.toFile();
		
		try(
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewfileObj, true))))
			{
				out.println("Claire");
				out.close();
			}
		catch (IOException e)
			{
				e.printStackTrace();
			}
		
		try(BufferedReader in = new BufferedReader(new FileReader(aNewfileObj)))
		{
			String peopleInClassroom;
			while((peopleInClassroom = in.readLine())!= null)
			{
				System.out.println(peopleInClassroom);
			}
		
		}
		
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		
		
		
		
	}//main
}//class
