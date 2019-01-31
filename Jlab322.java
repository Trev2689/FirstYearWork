class Jlab322

//Student Name:	Trevor Doyle
//Student Number: C00170053
//Date: 30/01/17
//Purpose: Write a program that will find the sum of a collection of data values. 
//			Your program should terminate when a zero value is read.

{		
    public static void main(String[] args)
    {
    	int num1;
    	int num2;
    	int num3;
    	int sum;
    	
    	System.out.println("Please enter first number");
    	num1=EasyIn.getInt;
    	System.out.println("Please enter second number");
    	num2=EasyIn.getInt;
    	System.out.println("Please enter third number");
    	num3=EasyIn.getInt;
    	sum=num1+num2+num3;
    	while(sum!=0)
    		{
    			System.out.println("The sum of the values is" +sum);
    		}
    		
    }

}
    	