package com.lockedMe.Operations;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	String fileName;
	Scanner sc = new Scanner(System.in);
	
	File dir=new File("C:\\Users\\catch\\eclipse-workspace\\VirtualKeyForRepositories\\MyDirectory");
	//Accepts filename of the file to be deleted and calls the function that will delete the file
	
	public void deletingFile(){
		DeleteFile d=new DeleteFile();
		//printing files present in the system
		System.out.println("The files present in the directory are");
		d.displayFile();
		
		//Accepting name of the files from the user
		System.out.println("Enter the file name to be deleted");
		fileName=sc.next();
		//Deleting file
		d.delete(fileName);
	}
		
		
	//Deleting file from the list
	public void delete(String fileName) {
		File file=new File(dir, fileName);
		if(file.delete()) 
			System.out.println("FILE IS DELETED.."+file.getName());
		else
			System.out.println("FILE DOES NOT EXISTS");
	}
		
	//Displaying Contents of the file 
	public void displayFile() {
		String[] children=dir.list();
		if(children==null) {
			System.out.println("Directory is Empty");
		}
		
		else {
			for(int i=0;i<children.length;i++) {
				String filename=children[i];
				System.out.println(filename);
			}
		}
	}
		

}
