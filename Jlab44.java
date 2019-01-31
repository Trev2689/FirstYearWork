class  JLAB44

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		09/11/16
// Purpose : 	Modify the program produced in (1) so that it writes out the number of uppercase characters in the user's input.
{		
    public static void main(String[] args)
    {
    	String name; //name
    	int noOfChars; // stores upper num
    	char upper; //stores upper count
    	int index; 
    	
    	
    	System.out.println("Please enter your name");
    	name=EasyIn.getString();
    	noOfChars=0;
    	 
    	for (index=0 ;index<name.length();index++)
    		{
    			upper= name.charAt(index);
    			if(upper>= 'A' && upper <= 'Z') // looks for char between a and z
    			noOfChars++; // adds it to upper count
    		}
    	System.out.println("The name entered is" +name);
    	System.out.println("The number of uppercase characters is "+noOfChars);
        }
	
      }

