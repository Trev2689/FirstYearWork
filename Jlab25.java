class Jlab25

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose :			Modify this program so that it takes 3 numbers and then outputs whether :
//
//						1. The first number is exactly divisible by both numbers.
//						2. The first number is exactly divisible by one of the 2 numbers. If so, output
//						which one it is. Also output if it is not exactly divisible by either number.


{
    public static void main(String[] args)
    {
    	double number1;
    	double number2;
    	double number3;
    	 
    	System.out.print("Please enter a number1 ");  
		number1 = EasyIn.getDouble();
		System.out.print("Please enter a number2 ");  
		number2 = EasyIn.getDouble();
		System.out.print("Please enter a number3 ");  
		number3 = EasyIn.getDouble();
		
    	
		if(number1 % number2 == 0 && number1 % number3 ==0)
    	{
    		System.out.print("\nThe number is exactly divisable by both numbers");
		}
		if((number1 % number2==0)||(number1%number3==0))
		{
			System.out.print("\nThe number is divisable by one of the two numbers");
		}
		if (number1%number2==0)
		{
			System.out.print("\nThe number is exactly divisable by" + number2);
		}
		else if(number1%number3==0)
		{
			System.out.print("\nThe number is exactly divisable by" + number3);
		}
		else
		{
			System.out.print("\nThe number is not exactly divisable by either number");
		}
			
		
        
    }
}

   	
