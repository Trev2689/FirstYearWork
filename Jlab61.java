class JLAB61

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		11/1/17
// Purpose :Write a method called isEven() 
//			that takes an integer as its argument and 
//			returns true if the argument is an even 
//			number otherwise it returns false. 	
{
	
	
	public static void isEven(int number)						// parameter	
	
	{
		if(number%2==0)
		{
			System.out.println("True,number is even");			//Method
		}
		else
		{
			System.out.println("False, number is not even");
		}
	}

	public static void main (String args[])
    
    {
    	int number;
    		
    	System.out.println("Please enter a  number");			//Main
   		number=EasyIn.getInt();
    	isEven(number);											//Call Method
    }
}     