class Jlab24

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose :			Write a program which ask the user for 2 numbers, 
//						it then indicates whether the first number is exactly divisible by the second number.
{
    public static void main(String[] args)
    {
    	double number1;
    	double number2;
    	 
    	System.out.print("Please enter a number ") ;  
		number1 = EasyIn.getDouble();
		System.out.print("Please enter a number ") ;  
		number2 = EasyIn.getDouble();
		
		

    	
    	
		if(number1%number2==0)
    	{
    		System.out.print("\nThe number is evenly divisable by" + number2);
    	}
    	else
		{
	    	System.out.print("The number is not evenly divisable by"  + number2);
		}

    	
    
        
        
    }
}

   	