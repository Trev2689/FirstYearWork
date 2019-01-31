class  JLAB2B2

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				11/10/16
// Purpose : 			Write a program to calculate credit card interest. Interest is charged at 12% for the first €500 and at 18% for any remaining amount over €500. 



{
    public static void main(String[] args)
    {
    	double amountOwed;
    	double interest;
    	final double INTEREST1=0.12;
    	final double INTEREST2=0.18;		
    	
    	System.out.print("Please enter amount owed ");
    	amountOwed=EasyIn.getDouble;
    	
    				
    	if(amountOwed<=500.00)
    	{	
    	double interest=amountOwed*INTEREST1;
    		System.out.print("Your interest owed is " + interest);
    	}	
    		
    	else if(amountOwed>500.00)		
    	{
    	double interest=amountOwed*INTEREST2;
    		System.out.print("Your interest owed is " + interest);	
    	}	
    		
    			
    }
}
