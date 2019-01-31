//import java.util.Scanner;
class Jlab76

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053 
// Date :		17/2/17
// Purpose :Write a program that reads in an array of strings and lists each string on a separate 
//			line in output telling you if it is a palindrome or not e.g. :
//			Abba	is a palindrome
//			A bba is not a palindrome …etc
{

	public static boolean isPal(String str)
    {
		
		int posL = 0 ;
		int posR = str.length() - 1 ;
		boolean pal = true ;
		
		while(posL < posR && pal == true)
			{
				if(str.charAt(posL) !=  str.charAt(posR))
					{
						pal = false ;	
					}
				
				posL++ ;
				posR-- ;
			}
		return pal ;
	}
		

	
	public static void main (String args[])
    {
    	//Scanner input = new Scanner(System.in);
    	
    	
    	String stringArray[];
    	stringArray = new String[4];
		int index;
		int arrindex;
		int strindex;
		
	
		for(index=0; index<stringArray.length; index++)
   			{
   				System.out.println("Enter String" + index + " ");
   				stringArray[index] = EasyIn.getString();
   				

   				
   			}
   			
   	/*	 if(isPal(stringArray[0]) == true || isPal(stringArray[1]) == true || isPal(stringArray[2]) == true || isPal(stringArray[3]) == true)
    		{
    	  System.out.println(" array is a palindrome");
    		}	
    	else
    		{
    		System.out.println(" arrays isnt palindrome");
    		}*/
    		
    		
    		
    		
    		if(isPal(stringArray[0]) == true)
    		{
    			System.out.println(stringArray[0] + " is palindrome");
    		}
    		else
    		{
    			System.out.println(stringArray[0] + " isn't palindrome");
    		}
    		if(isPal(stringArray[1]) == true)
    		{
    			System.out.println(stringArray[1] + " is palindrome");
    		}
    		else
    		{
    			System.out.println(stringArray[1] + " isn't palindrome");
    		}
    		if(isPal(stringArray[2]) == true)
    		{
    			System.out.println(stringArray[2] + " is palindrome");
    		}
    		else
    		{
    			System.out.println(stringArray[2] + " isn't palindrome");
    		}
    		if(isPal(stringArray[3]) == true)
    		{
    			System.out.println(stringArray[3] + " is palindrome");
    		}
    		else
    		{
    			System.out.println(stringArray[3] + " isn't palindrome");
    		}
    		
    
    	
    	
    }
} 
		
   			
   			
   			
   			
   			
   			
   			
   			
   			
   			
   			
   			
   			
   		/*for(index=0; index<stringArray.length; index++)
   			{
   				
   				System.out.println(stringArray[index]);
   				

   				
   			}
   			
   		//	for(arrindex=0; arrindex<theArray.length; arrindex++)
   		//	{
   				
		for (arrindex = 0; arrindex < stringArray.length; arrindex ++)
 			{
   				for (strindex = 0; strindex < stringArray[arrindex].length(); strindex ++)
    	  			{
    	     				 
    	     				 System.out.print(stringArray[strindex]);
   								
    	 			 }	
   			
   	
   			}
   			
   			//isPal(charArray); */
   			
   			
   		
    											
 
