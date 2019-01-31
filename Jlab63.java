class JLAB63

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		11/1/17
// Purpose :Write a method alphaCount() that takes a string as its argument 
//			and returns the number of alphabetic characters in that string. 	
{
	public static void alphaCount(String userString)							
	
	{	
		int alphaCount=0;
		int index;
		
		for(index=0; index<=userString.length()-1; index++)
		{
																								//alphaCount method
			if((userString.charAt(index) >='a' && userString.charAt(index)<='z'))
			{
				alphaCount++;
			}																					//Check if alphabetical
			else if((userString.charAt(index))>='A' && (userString.charAt(index)<='Z'))
			{
				alphaCount++;	
			}
			
		}
		System.out.println("The number of alphabetical characters in the string is " +alphaCount);	
	}
			

	public static void main (String args[])
	
	{
		String userString;
    	
    		
    	System.out.println("Please enter a string");			//Main
   		userString=EasyIn.getString();
   		alphaCount(userString);						//Call Method
    												
    }    

}	
