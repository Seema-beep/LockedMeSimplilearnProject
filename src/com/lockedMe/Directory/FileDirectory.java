package com.lockedMe.Directory;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.lockedMe.LockedMainMenu;



public class FileDirectory {
	Scanner sc=new Scanner(System.in);
	int choice;
	File directory=new File("C:\\Users\\catch\\eclipse-workspace\\VirtualKeyForRepositories\\MyDirectory");
	ArrayList<String>fileList=new ArrayList<>();
	
	public void display() {
		/*Sub-Menu..Options*/
		
		do {
			System.out.println("1..Display  file names in the directory");
			System.out.println("2..Go to Main Menu");
			//Accepting User input
			try{	
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
				FileDirectory d = new FileDirectory();
				d.display();
			}
			//Perform User Functions
			switch(choice) {
			  case 1: 
				  FileDirectory fd=new FileDirectory();
				  fd.filedirectory();
				  break;
			  case 2:
				  LockedMainMenu lm=new LockedMainMenu();
				  lm.menu();
				  
				  default:
					  System.out.println("Please Enter Valid Option");
					  break;
			}
			
			
			
			
		}while(choice!=2);
	}
	//Arranging the contents of the file directory 
			private void filedirectory() {					
			      String[] children = directory.list();
			      
			      //Gets filenames from the directory and adds it to an array list, that is used to arrange the contents in ascending order
			      if (children == null) {
			         System.out.println( "Directory Empty.");
			      } else { 
			         for (int i = 0; i< children.length; i++) {
			            String filename = children[i];
			            fileList.add(filename);
			         }
			      }  
			      
			      Collections.sort(fileList);
			      System.out.println("Files in Ascending Order : " + fileList);
	

}
}