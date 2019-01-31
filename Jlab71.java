import java.util.Scanner; 
class JLAB71

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		16/2/17
// Purpose : 	Write a program that reads in an array of integers 
//				and then displays the number of odd and even numbers in the array. 
//				Use a method you have written already isEven()on each array element. 	
{
	
		public static void isEven(int numArray[])						// parameter	
	
	{						
	
	
		int index;
		//int numArray[];
    	numArray = new int[5];
		int evenCount=0;
		int oddCount=0;
		
		for(index=0; index<numArray.length; index++)
   			{
   			
   				if(numArray[index] %2 == 0)
   					{
   						evenCount++;
   					}
   				else
   					{
   						oddCount++;
   					}
   		
   			}
   		System.out.println("Even numbers are" +evenCount);
   		System.out.println("Odd numbrs are" +oddCount); 
   		

	}


	public static void main (String args[])
    
    {
    	Scanner input = new Scanner(System.in);
    	
    	int numArray[];
    	numArray = new int[5];
		int numAmt;
		int index;
		int evenCount=0;
		int oddCount=0; 
    		
   		
   		for(index=0; index<numArray.length; index++)
   			{
   				System.out.println("Enter Number" + index + " ");
   				numArray[index] = input.nextInt();
   				
   			
   					
   			}
   		
   		
		for(index=0; index<numArray.length; index++)
   			{
   			
   				if(numArray[index] %2 == 0)
   					{
   						evenCount++;
   					}
   				else
   					{
   						oddCount++;
   					}
   		
   			}
   			//isEven(numArray[index]);
   		System.out.println("Even numbers are" +evenCount);
   		System.out.println("Odd numbers are" +oddCount);
   	
   	
   			
   			
   		
   			
   			
   		
    											
    }
} 




/*public int[] findEvens() {
  int numberEvens = 0;
  for (int i = 0; i < numbers.length; i++) {
     if (numbers[i] % 2 == 0) {
        numberEvens++;
     }
  }*/
    