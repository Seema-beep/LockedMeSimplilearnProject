# LockedMeSimplilearnProject
PROJECT NAME:     LOCKEDME.COM
                            
PROJECT GIT HUB LINK 
https://github.com/Seema-beep/LockedMeSimplilearnProject.git

DEVELOPED BY 
SEEMA BHUYAN
BACKGROUND OF THE PROBLEM STATEMENT
	Company Lockers Pvt Ltd aims to digitize their product. A  prototype of the project has been asked to develop. Lockedme.com is chosen as the first project to be developed.

PROJECT ABSTRACT  :  
The project LockedMe.com is designed to manage huge volume of files of the company. This will reduce the work of the file manager and helps to maintain file records in a systematic and synchronised manner.

EXISTING SYSTEM :
In the existing system every operation is done manually.

PROPOSED SYSTEM :
The proposed system aims for easy file operations that has a user friendly interface.

PROJECT OBJECTIVES :
               Java console based application  allows user to input menu options for
1)	Displaying file/folder structure in ascending order.
2)	Add files to the existing directory 
3)	Delete uses specified file from the existing directory test.
4)	Search for a file.
5)	It does not crash and provides options to exit


Sprint 1:

1. Design Flow chart  of the program
2. Design Classes and Methods
3. Design Exceptions
4. Create Project Structure
5. Code Data tier
6. Code Business tier interface

Sprint 2:

1. Code Business Tier Methods
a. List File Method
b. Create File Method
c. Search File Method
d. Delete File Method
2. Code the level one menu
3. Code the level two menu
4. Call the Business Tier Methods in the Main File
5. Use String Formatting to display the output in a standard manner
Algorithm:

1) Start
2) Print Options to list, manage files and exit
3) If choice is 1
a) Read all files in the directory
b) Sort files in ascending order using Collections.sort()
c) Print all the files
d) Goto 3
4) If the choice is 2
a) Print Options to add, search and delete files
b) If the choice is 1
i) Accept file name from the user
ii) Create a new file with that name
iii) Goto b
c) If the choice is 2
i) Accept file name from the user
ii) Delete the file with that name
iii) Goto b

d) If the choice is 3
i) Accept file name from the user
ii) Search for file with that name
iii) If file found print found
iv) Else print Not found
v) Goto b
e) If the choice is 4 goto a
f) Goto 2
5) If the choice is 3 goto 7
6) Goto 2
7) Stop
Flowchart of the System:

  
JAVA CONCEPTS USED :
Core Java Concepts Used:
•	Encapsulation
•	File Handling
•	Abstraction
•	Collection Framework Concepts.(Array list, Sorting)
•	Data Structures Used ,Linear Searching 


COMPONENT HIERACHY :-

(1)	LockedMainmenu.java :

This is the entry point of the project. It contains the main method.

(2)	Filedirectory.java :

This method displays the available files in the directory in ascending order.

(3)	Fileoperation.java :

This method involves the different file operations – Add option, Delete or play, search and going back to main menu.

        Conclusion :

The application has a user friendly interface with easy retrieval of file names and operation to add, search and delete files.


