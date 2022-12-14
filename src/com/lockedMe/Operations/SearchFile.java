package com.lockedMe.Operations;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class SearchFile {
	String fileName;
	Scanner sc = new Scanner(System.in);
	
	File dir=new File("C:\\Users\\catch\\eclipse-workspace\\VirtualKeyForRepositories\\MyDirectory");
	ArrayList<String>fileList=new ArrayList<>();
	
	//Accept name of the files to be searched..calls functions to be searched
	public void searchingFile() {
		//Accepting name of the file from the user 
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		SearchFile sf = new SearchFile();
		sf.searchList();
		sf.search(fileName);
	}
	
	//Gets the filenames from the directory and adds it to an arraylist, that is used to search the file 
			public void searchList() {				
		      String[] children = dir.list();
		      
		      if (children == null) {
		         System.out.println( "Directory Empty.");
		          } 
		      else { 
		            for (int i = 0; i< children.length; i++) {
		            String filename = children[i];
		            fileList.add(filename);
		         }
		      }  
		      
			}
	
			
			//Searching the arraylist to check if the file is present
			public void search(String fileName) {
				boolean present = fileList.contains(fileName); 
				
				if (present) 
		            System.out.println("File is Present in the directory"); 
		        else
		        	System.out.println("File is not present in the directory."); 
			}

}
