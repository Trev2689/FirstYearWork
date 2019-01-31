class Jlab33

//Student Name:	Trevor Doyle
//Student Number: C00170053
//Date: 30/01/17
//Purpose:3)	Write a program to read a list of integer values which will find and 
//				display the index of the first occurrence and the last occurrence of 
//				the number 12. 
//				Your program should print the Index values of 0 (zero) if the number 12 is not
//				 found. The index is the sequence number of the data item 12. 
//				 For example if the 8th data item is the only 12, the index value 8 should
//				 be displayed for the first and last occurrence 

{		
    public static void main(String[] args)
    {	
    	
		int alphaCount=0;
		String userString="12 the two dogs 12";
		int twelveCount;
		int index;
		
		for(index=0; index<=userString.length()-1; index++)
		{
																								
			if(userString.charAt(index) ="12")
			{
				twelveCount++;
				System.out.println(index);
			}																					
			
			
		}
		System.out.println("The number of occurences of 12 in the string is " +twelveCount);	
	}
} 
    	