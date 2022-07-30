package com.LockedMe;
import java.util.*;
import java.io.*;
public class FileOperations extends WelcomeScreen {
	void DisplayOperations()
	{
		System.out.println("Press 1 to Add Files");
		System.out.println("Press 2 to Delete a File");
		System.out.println("Press 3 to Search a File");
		System.out.println("Press 4 to Return to Main Menu");
	}
	void addFile() {
		System.out.println("Enter the name of the File to be Added: ");
		String filename = sc.next(); //hello.txt
		try {
		File f = new File(d.getName() +"/"+ filename);
		//File f = new File(C://Users/Admin/Desktop/Javap/VirtualKey/TextFiles/hello.txt);
		f.createNewFile();
		System.out.println("File was Created Successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void deleteFile()
	{
		System.out.println("Enter the name of the File to be Deleted: ");
		String filename = sc.next(); //hello.txt
		String Files[] = d.list();
		int found = 0;
		for(int i=0;i<Files.length;i++)
		{
			if(Files[i].equals(filename))
				found++;
			else
				continue;
		}
		if(found>0)
			{
			File f = new File(d.getName() +"/"+filename);
			//File f = new File(C://Users/Admin/Desktop/Javap/VirtualKey/TextFiles/hello.txt);
			f.delete();
			System.out.println("File was Deleted Successfully");
			}
		else
		{
			System.out.println("The File you are trying to delete was not Found");
		}
	}
	void searchFile()
	{
		System.out.println("Enter the name of the File to be Searched: ");
		String filename = sc.next();
		String Files[] = d.list();
		int flag=0;
		for(int i=0;i<Files.length;i++)
		{
			if(Files[i].equals(filename))
			{
				System.out.println("The File you searched for was Found");
				flag++;
			}
		}
		if(flag==0)
			System.out.println("The File you searched for was not Found");
	}
	void Operations()
	{
		FileOperations fo1 = new FileOperations();
		int ch=0;
		while(ch!=4)
		{
			fo1.DisplayOperations();
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				fo1.addFile();
				break;
			case 2:
				fo1.deleteFile();
				break;
			case 3:
				fo1.searchFile();
				break;
			case 4:
				WelcomeScreen ob = new WelcomeScreen();
				ob.Display();
				break;
			}
		}
	}
}
