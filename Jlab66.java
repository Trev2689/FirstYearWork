class JLAB66

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		25/1/17
// Purpose :Rewrite each of the programs in lab sheet 4 using methods where the method 
//			takes a string as its argument and returns the appropriate value. 
//			Come up with your own names for your methods


{
	 
	
	public static void surName(String name)						// parameter	
	
	{
	String name;
    String firstName;
    String surName;
    int spacePos;
    	
    	System.out.println("Please enter your name");
    	name=EasyIn.getString();
    	spacePos = name.indexOf(" ");
    	firstName = name.substring(0,spacePos); 
    	surName=name.substring(spacePos);
    	System.out.println("The Surname is "+surName);
    }
	
		
	public static void firstName(String name)						// parameter	
	
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
	public static void noOfChars(String name)						// parameter	
	
	 {
    	String name;
    	int noOfChars;
    	
    	System.out.println("Please enter your name");
    	name=EasyIn.getString();
    	noOfChars=name.length(); 
    	System.out.println("The number of characters is "+noOfChars);
        
        
	}
	public static void upperChars(String name)						// parameter	
	
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
	public static void reverse(String name)						// parameter	
	
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
	public static void reverseNames(String name)						// parameter	
	
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
	public static void occuranceA(String name)						// parameter	
	
	 {
	 	String name;
    	String firstName;
    	String surName;
    	int spacePos;
    	
    	System.out.println("Please enter your name");
    	name=EasyIn.getString();
    	spacePos = name.indexOf(" ");
    	
    	int charCount = 0;
        for(int i =0 ; i<name.length(); i++)
        {
            if(name.charAt(i) == 'a'||name.charAt(i)=='A')
                charCount++;
		}

    	
   
   	System.out.println("The number of occurences of the letter A are "+charCount);
	} 

	public static void noMiddle(String name)						// parameter	
	
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
	public static void main (String args[])
    
    {
    	int mark;
    		
    	System.out.println("Please enter your mark");			//Main
   		mark=EasyIn.getInt();
    	award(mark);											//Call Method
    }  
}