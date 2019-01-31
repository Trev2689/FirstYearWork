import java.util.Scanner; 
class JLAB72

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053 
// Date :		17/2/17
// Purpose : Write a program that reads in an array of integers and then tells you the highest and lowest numbers in the array	
{
	
	public static void main (String args[])
    {
    	Scanner input = new Scanner(System.in);
    	
    	int numArray[];
    	numArray = new int[5];
		int index;
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
	
    		
   		
   		for(index=0; index<numArray.length; index++)
   			{
   				System.out.println("Enter Number" + index + " ");
   				numArray[index] = input.nextInt();
   			
   			}
   		
   		
		for(index=0; index<numArray.length; index++)
   			{
   				if(numArray[index] <lowest)
   					{
   						lowest=numArray[index];
   					}
   				else if(numArray[index] > highest)
   					{
   						highest=numArray[index];
   					}
   				 
   			
   		
   			}
   		
   		System.out.println("highest number is" +highest);
   		System.out.println("lowest number is" +lowest);  
   	
   	
   			
   			
   		
   			
   			
   		
    											
    }
} 
