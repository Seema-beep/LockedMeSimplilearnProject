package com.lockedMe.Operations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	String fileName;
	Scanner sc = new Scanner(System.in);
	
	//function to accept file names from user and add to the directory
	public void addingFile() {
		//Accepting name of the files from user
		System.out.print("Enter the file name : ");
		fileName = sc.next();
		
		//Calling CreateFile function to create the file 
		AddFile a=new AddFile();
		a.createFile(fileName);
	}
		

	//Adding file to the directory 
		public void createFile(String fileName) {
			File dir = new File ("C:\\Users\\catch\\eclipse-workspace\\VirtualKeyForRepositories\\MyDirectory");
			
		    try {
		      File file = new File(dir, fileName);
		      
		      if (file.createNewFile()) {    	      	 
				System.out.println("FILE CREATED SUCCESSFULLY : " + file.getName());
		      } else {
		    	  System.out.println("File already exists. Please enter another name");
		    	  AddFile a = new AddFile();
		    	  a.addingFile();
		      }
		    } catch (IOException e) {
		    	System.out.println("An error occurred.");
		    	e.printStackTrace();
		    }
	
	

}
		
}
