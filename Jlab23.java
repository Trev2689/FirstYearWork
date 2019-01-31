class Jlab23

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose :			Write a program which determines whether a number is odd or even
{
    public static void main(String[] args)
    {
    	double number;
    	double even;
    	 
    	System.out.print("Please enter a number ") ;  
		number = EasyIn.getDouble() ;
		

    	even = number%2;
    	
		if(number%2==0)
    	{
    		System.out.print("\nThe number is even ");
    	}
    	else
		{
	    System.out.print("The number is not even ");
		}

    	
    
        
        
    }
}

   	