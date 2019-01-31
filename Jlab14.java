class Jlab14

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose : Enter three numbers, and display, their sum, product and the average of the three.			




{
    public static void main(String[] args)
    {
    	int number1;
    	int number2;
    	int number3;
    	int sum;
    	int product;
    	double average;
    	
       
         
    	System.out.print("Enter number1 ") ;  
		number1 = EasyIn.getInt() ;
		System.out.print("\n\n\t The sum of the numbers is " + number1 );
		System.out.print("\n\n\t The product of the numbers is " +(number1));
		System.out.print("\n\n\t The average of the numbers is " + (number1/1) );
		
    	System.out.print("\nEnter number2 ") ;
    	number2 = EasyIn.getInt();
    	System.out.print("\n\n\tThe sum of the numbers is " + (number1+number2) );
    	System.out.print("\n\n\tThe product of the numbers is " +(number1*number2));
    	System.out.print("\n\n\tThe average of the numbers is " + (number2/2) );
    	
    	System.out.print("\nEnter number3 ");
    	number3= EasyIn.getInt();
    	sum=number1+number2+number3;
    	product=number1*number2*number3;
    	average=(double)sum/3;
    	System.out.println("\n\n\tThe sum of the numbers is "+sum ) ;
    	System.out.println("\n\n\tThe product of the numbers is "+product );
    	System.out.println("\n\n\tThe average of the numbers is "+average );
    }
}

