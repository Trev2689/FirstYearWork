
class JLAB74

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053 
// Date :		17/2/17
// Purpose : 4)	Write a program that reads in an array of alphabetical characters 
//				and tells you how many vowels and consonants were present in the array. 
//				Hint - write this in such a way that avoids large compound conditions.	
{
	public static boolean isVowel (char c)
	{
		if(c=='a'|| c=='A'|| c=='e'|| c=='E'||
			c=='i'|| c=='I'|| c=='o'|| c=='O'||
			c=='u'|| c=='U')
			{
				return true;
			}
		else
			{
				return false;
			}
	}
		

	
	public static void main (String args[])
    {
    	
    	
    	
    	char charArray[];
    	charArray = new char[5];
		int index;
		
		int vowCount=0;
		int conCount=0;
		
	
    		
   		
   		for(index=0; index<charArray.length; index++)
   			{
   				System.out.println("Enter Character" + index + " ");
   				charArray[index] = EasyIn.getChar();
   				
   			}
   		for(index=0; index<charArray.length; index++)
   			{
   				if(isVowel(charArray[index]))
   				{
   				
   				vowCount++; 
   				}
   				else
   				{
   					conCount++;
   				}
   				
   			
   		
   			}   	
   			
   			
   		System.out.println("The number of vowels present are " +vowCount);
   		System.out.println("The number of consonants present are " +conCount);
   			
   			
   		
    											
    }
} 








/*int arrindex;
		int strindex;
		///String charAray[];
		///charArray = new String [5];
		int vowCount;
		boolean vowel = 'a' || 'e' || 'i' || 'o' || 'u' ;
		
	//	for(arrindex=0; arrindex<theArray.length; arrindex++)
   		//	{
   				
		for (arrindex = 0; arrindex < theArray.length; arrindex ++)
 			{
   				for (strindex = 0; strindex < theArray[arrindex].length(); strindex ++)
    	  			{
    	     				 if(theArray[strindex] = vowel)//'a' || 'e' || 'i' || 'o' || 'u')
   								vowCount++;
    	 			 }	
 }

   				
   			
   		
   			
   			
		return vowCount;
	}*/