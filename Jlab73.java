import java.util.Scanner; 
class JLAB73

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053 
// Date :		17/2/17
// Purpose : 3)	Modify 2) above so that it tells you how many times the highest and lowest number appeared.	
{
	
	public static void main (String args[])
    {
    	Scanner input = new Scanner(System.in);
    	
    	int numArray[];
    	numArray = new int[5];
		int index;
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE; 
		int lowcount=0;
		int highcount=0;
	
    		
   		
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
   		
   		for(index=0; index<numArray.length; index++)
   			{
   				if(numArray[index] == lowest)
   					{
   						lowcount++;
   					}
   				else if(numArray[index] == highest)
   					{
   						highcount++;
   					}
   				 
   			
   		
   			}
   		
   		System.out.println("highest number is " +highest);
   		System.out.println("lowest number is " +lowest); 
   		System.out.println("highest number was entered " +highcount +" times");
   		System.out.println("lowest number was entered " +lowcount + " times");
   	
   	
   			
   			
   		
   			
   			
   		
    											
    }
} 
