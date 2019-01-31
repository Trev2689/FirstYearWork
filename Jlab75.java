class Jlab75

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053 
// Date :		17/2/17
// Purpose : 5)	Write a program that reads in an array of 
//				alphabetic characters and tells you if this array of characters is a palindrome or not. 
//				What is the main difference in terms of implementation between 
//				this program and your last project?	
{
	public static char[] isPal (char[] charArray)
	{
		
		if(charArray[0] == charArray[3] && charArray[1] == charArray[2])
			{
				System.out.println("It is a palindrome");
			}
		else
			{
				System.out.println("It isn't a palindrome");
			}
			
			
		return charArray;
		
		
	
	}
		

	
	public static void main (String args[])
    {
    	
    	
    	
    	char charArray[];
    	charArray = new char[4];
		int index;
		
	
		for(index=0; index<charArray.length; index++)
   			{
   				System.out.println("Enter Character" + index + " ");
   				charArray[index] = EasyIn.getChar();

   				
   			}
   		
   			
   			isPal(charArray);
   			
   			
   		
    											
    }
} 
