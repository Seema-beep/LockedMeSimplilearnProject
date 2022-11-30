package com.lockedMe.Operations;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.lockedMe.LockedMainMenu;

 
public class FileOperations {
	int choice;
	Scanner sc = new Scanner(System.in);
	
	public void operationsOnFile() {
		do {
			System.out.println("1. Add files to the directory");
			System.out.println("2. Delete a file from the List");
			System.out.println("3. Search a file from the List");
			System.out.println("4. Go to main Menu");
			
			//Accepting User Input
			try {
				System.out.print("Enter Choice : ");
				choice = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid Option. Please enter valid option.");
				FileOperations fo=new FileOperations();
				fo.operationsOnFile();
				
			}
			
			switch(choice) {
			case 1: 
				AddFile a=new AddFile();
				a.addingFile();
				
			break;
			
			case 2:
				DeleteFile d=new DeleteFile();
				d.deletingFile();
				break;
				
			case 3:
				SearchFile s = new SearchFile();
				s.searchingFile();
				break;
			case 4:
				LockedMainMenu l = new LockedMainMenu();
				l.menu();
				break;
			default:
				System.out.println("Invalid Option. Please enter valid option.");
				break;
			
			}
			
			
		}while(choice!=4);
	}
	

}
