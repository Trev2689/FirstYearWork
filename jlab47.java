class JLAB47

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		28/11/16
// Purpose : Modify the program produced in (1) so that it 
//			writes out the number of occurrences of the letter a in the user's input. (Treat A and a as the same character).
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
    	
    	int charCount = 0;
        for(int i =0 ; i<name.length(); i++)
        {
            if(name.charAt(i) == 'a'||name.charAt(i)=='A')
                charCount++;
		}

    	
   
   	System.out.println("The number of occurences of the letter A are "+charCount);
	} 
}
	
      