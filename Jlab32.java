class  JLAB41

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		07/11/16
// Purpose : 	Write and test a program which will prompt the user to enter their name, 
//				read in the name, 
//				and write to the screen just the surname. 
//				(Where surname is interpreted as everything after the first space).

{		
    public static void main(String[] args)
    {
    	String name;
    	String firstName;
    	String surName;
    	int spacePos;
    	
    	System.out.println("Please enter your name");
    	name=EasyIn.getString();
    	spacePos = name.indexOf(" ");
    	surName = name.substring(spacePos+1); 
    	System.out.println("The Surname is"+surName);
        }
	
      }

