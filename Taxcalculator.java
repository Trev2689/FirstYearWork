class taxcalculator

// Student Name : 		Trevor Doyle
// Student Id Number : 	c00170053
// Date :				19/9/16/
// Purpose : 			A program to calculate tax




{
    public static void main(String[] args)
      {
       	
    	int grossPay;
    	int children;
    	double tax;
        
       
         
    	System.out.print("Enter annual income ") ;  
		grossPay = EasyIn.getInt() ;
    	System.out.print("Enter number of children ") ;
    	children = EasyIn.getInt();
    	tax = (grossPay - 5000 - children * 1000) * 0.24 ;
    	System.out.println("Tax payable is"+ tax) ;
    }
}

