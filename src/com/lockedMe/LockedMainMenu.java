package com.lockedMe;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.lockedMe.Directory.FileDirectory;
import com.lockedMe.Operations.FileOperations;

public class LockedMainMenu {
	Scanner sc=new Scanner(System.in);
	int choice;
	
   
	
	public static void main(String[]args) {
		//Welcome Screen displaying Developer Name and Application Details
		        System.out.println("--------------------------------------------"); 
				System.out.println("Welcome to LockedMe.com Project...PHASE-1");
				System.out.println("Developed By 'SEEMA BHUYAN'");	
				System.out.println("Organisation...COMPANY LOCKERS PVT.LTD");
				System.out.println("--------------------------------------------");
				
				
				LockedMainMenu lm=new LockedMainMenu();
				lm.menu();
				
	}
	
	public void menu() {
		do {
		//MENU DISPLAYING THE FLOW OF THE APPLICATION..WITH OPTIONS
		      System.out.println("MAIN MENU...PLEASE SELECT ONE OF THE FOLLOWING OPTIONS");
		      System.out.println("1...List the files available in the directory");
		      System.out.println("2...Perform file operations..ADD,DELETE,SEARCH");
		      System.out.println("3...Exit");
		      //Accepting input from user
		      
		      try {
		    	    System.out.print("Enter Choice : ");
					choice = sc.nextInt();
		    	  
		           }
		      catch(InputMismatchException e){
		    	  System.out.println("Invalid Option. Please enter valid option.");
					LockedMainMenu lm=new LockedMainMenu();
					lm.menu();
		                 }
		      //Permorm functions as User Input
		      
		      
		      switch(choice) {
				case 1:
					FileDirectory fd=new FileDirectory();
					fd.display();
										
					break;
				case 2:
					FileOperations fo = new FileOperations();
					fo.operationsOnFile();
					break;
				case 3:
					System.out.println("Thank you for using our application!");
					break;
				default:
					System.out.println("Invalid Option. Please enter a valid option.");
			      }
		        }
		       while(choice!=3);
		      
		
		
		
	}
	
	

}
