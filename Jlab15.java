class Jlab15

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose : . 1.	Write a program in which the user enters an integer value.
// 					Depending on the input the program will output whether the 
// 					number was greater than zero, less than zero or equal to zero.



{
    public static void main(String[] args)
    {
    	int number;
    	
    	
       
         
    	System.out.print("Please enter a number ") ;  
		number = EasyIn.getInt() ;
    	
    	if (number<0)
    	{
    		System.out.print("number is less than zero");
    	}
    	
    	if (number>0)
    	{
    		System.out.print("number is greater than zero");
    	}
    	
    	if (number=0)
    	{
    		System.out.print("number is equal to zero");
    	}
    
        
    }
}

