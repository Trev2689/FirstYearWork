class JLAB62

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		11/1/17
// Purpose :Write a method called isAlpha() that takes a character 
//			as its argument and returns true if the character 
//			is alphabetic i.e. in the range A-Z, a-z, otherwise it returns false. 	
{
	public static void isAlpha(char character)						// parameter	
	
	{
		if((character >='a' && character<='z')||(character>='A' && character<='Z'))
		{
			System.out.println("True, character is alphabetical");
		}
		else
		{
			System.out.println("False, character is not alphabetical");
		}
		
	}

	public static void main (String args[])
    
    {
    	char userChar;
    		
    	System.out.println("Please enter a  character");			//Main
   		userChar=EasyIn.getChar();
   		isAlpha(userChar);
    															//Call Method
    }    
} 	
