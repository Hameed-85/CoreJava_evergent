package com.evergent.corejava.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeFileDEmo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			//attempt to open a file that doesst exist
			File file=new File("C:/mydata/myinfo1.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) 
			{
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e)
		{
			//handle the exception
			System.out.println("File not found"+e.getMessage());
			e.printStackTrace();
		}

	}

}
