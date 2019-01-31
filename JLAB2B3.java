
class  JLAB2B3

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				16/0/16
// Purpose : 			Write a program which asks the user to enter 3 different numbers. The program then tells the user which number was the lowest number entered.
		
{		
    public static void main(String[] args)
    {
    	double number1;
    	double number2;
    	double number3;
    	
    			
    	
    	System.out.print("Please enter number 1 ");
    	number1=EasyIn.getDouble();
    	System.out.print("Please enter number 2 ");
    	number2=EasyIn.getDouble();
    	System.out.print("Please enter number 3 ");
    	number3=EasyIn.getDouble();
    	
                                                                                                                                         
    	if(number1 < number2 && number1 <number3)
    	{		
    		System.out.print("The lowest number entered is " + number1);
    	}	
    		
    	else if(number2 <number1 && number2 <number3)
    	{	
    		System.out.print("The lowest number entered is " + number2);
    	}	
   		else if(number3< number1 && number3 <number2)
    	{
    		System.out.print("The lowest number entered is " + number3);
    	}
        
        if(number1<=number2&&number1<=number3 || number3<=number2 && number3 <= number1)
        {
                System.out.print("The middle number is " + number2);
        }
        else if(number2<=number1&&number2<=number3 || number3<=number1&&number3<=number2)
        {
                System.out.print("The middle number is" + number1);
        }
            else
            {
                System.out.print("The middle number is" + number3);
            }
        
        if(number1 > number2 && number1 > number3)
        {
                System.out.print("The largest number entered is " + number1);
        }
        else if(number2 > number1 && number2 > number3)
        {
                System.out.print("The largest number entered is " + number2);
        }
        else if(number3 > number1 && number3 > number2)
        {
                System.out.print("The largest number entered is " + number3);
        }
	
      }
}