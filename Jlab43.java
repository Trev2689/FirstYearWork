class  JLAB43

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		07/11/16
// Purpose : 	Modify the program produced in (1) so that it writes out the number of characters in the user's input.

{		
    public static void main(String[] args)
    {
    	String name;
    	int noOfChars;
    	
    	System.out.println("Please enter your name");
    	name=EasyIn.getString();
    	noOfChars=name.length(); 
    	System.out.println("The number of characters is "+noOfChars);
        }
	
      }

