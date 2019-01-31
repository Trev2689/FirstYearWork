class  JLAB48

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		28/11/16
// Purpose : Modify the program produced in (1) so that it writes out 
//			the user's input with any middle name removed (Joe Handsome Doe becomes Joe Doe)	
{		
    public static void main(String[] args)
    {
    	String name;
    	String firstName;
    	String middleName;
    	String surName;
    	int spacePos ;
    	int spacePos2;
    	int index;
    	
    	System.out.println("Please enter your name");
    	name = EasyIn.getString() ;
    	spacePos = name.indexOf(" ");
    	spacePos2= name.lastIndexOf(" ");
    	
    
    	firstName = name.substring(0,spacePos);
    	surName = name.substring(spacePos2);
    	System.out.println("The name excluding middle name is "+ firstName + surName);
     }
	
 }