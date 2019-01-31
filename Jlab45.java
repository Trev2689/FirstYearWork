class  JLAB45

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		09/11/16
// Purpose : 	Modify the program produced in (1) so that it 
//				writes out the user's input reversed (Joe Doe is output as eoD eoJ).

{		
    public static void main(String[] args)
    {
    	String name, reverse=""; //name
    	int length;
    	int index;
    	 
    	
    	System.out.println("Please enter your name");
    	name=EasyIn.getString();
    	length=name.length();
    	
    	 
    	for (index=length-1; index>=0; index--)
    		{
    			reverse=reverse+name.charAt(index);
    		}
    	System.out.println("The name entered is" +name);
    	System.out.println("The name entered in reverse is " + reverse);
        }
	
      }

