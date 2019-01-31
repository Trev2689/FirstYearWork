class  JLAB41

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		07/11/16
// Purpose : 	Modify the program produced at (1) so that it writes 
//				out the first name (everything up to the first space) instead of the surname.. 
			

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
    	firstName = name.substring(0,spacePos); 
    	System.out.println("The First name is "+firstName);
        }
	
      }

