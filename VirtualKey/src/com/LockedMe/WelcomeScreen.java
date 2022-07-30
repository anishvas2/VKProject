package com.LockedMe;
import java.util.*;
import java.io.*;
public class WelcomeScreen {
	File d = new File("C://Users/HP/Desktop/e-learning/VirtualKey/TextFiles/");
	Scanner sc = new Scanner(System.in);
	void MainMenu()
	{
		System.out.println("Press 1 to display Files");
		System.out.println("Press 2 to display Operations on Files");
		System.out.println("Press 3 to Quit");
	}
	void DisplayFiles()
	{
		String files[] = d.list(); 
		for(int i=0;i<files.length;i++)
			System.out.println(files[i]);
	}
	void Display()
	{		
		WelcomeScreen ws = new WelcomeScreen();
		FileOperations fo = new FileOperations();
		ws.MainMenu();
		int option = sc.nextInt();
		if(option==3)
			return ;
		if(option!=3)
		{
			switch(option)
			{
			case 1:
				ws.DisplayFiles();
				break;
			case 2:
				fo.Operations();
				break;
			}
			if(option!=2)
			ws.Display();
	}
	}
}
