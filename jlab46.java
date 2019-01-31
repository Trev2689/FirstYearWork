class  JLAB46

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		28/11/16
// Purpose : Modify the program produced in (1) so that it writes out the user's 
//				input with the names reversed (Joe Doe is output as Doe Joe).
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
    	surName = name.substring(spacePos++); 
    	System.out.println("The names reversed are "+ surName + firstName);
        }
	
      }


      