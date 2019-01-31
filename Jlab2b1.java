class Jlab2b1

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose :			Write a program which calculates the insurance premium for the coming year. 
//						The program asks the user for the value of last year's premium and the number of claims 
//						you made in the year. 
//						The basic premium for the following year  will be a 5% increase on last years premium. 
//						If the person made no claims they get a 40% discount on this increase. 
//						If they made a claim the get an extra charge of 20% for every claim that they made.

{
    public static void main(String[] args)
    {
    	final double NOCLAIMSDISCOUNT=0.40;
    	final double INCREASERATE=0.05;
    	double lastYearsPremium;
    	int numberOfClaims;
    	double increase;
    	double discount;
    	
    	
     
    	double claimsCharge;
    	
    	System.out.print("Please enter last years premium ");
    	lastYearsPremium=EasyIn.getDouble();
    	System.out.print("Please enter the number of claims made in the last year ");
    	numberOfClaims=EasyIn.getInt();
    	
    	claimsCharge=0.20*numberOfClaims;
    	increase=(lastYearsPremium*INCREASERATE)*claimsCharge;
    	discount=increase*NOCLAIMSDISCOUNT;
    	
    	
    				
    	if(numberOfClaims>=1)
    	{	
    	double newPremium=(lastYearsPremium+increase);
    		System.out.print("Your new premium is " + newPremium);
    	}	
    		
    	else if(numberOfClaims<=0)		
    	{
    	double newPremium=(lastYearsPremium+increase-discount);
    		System.out.print("Your new premium is " +newPremium);	
    	}	
    		
    			
    }
}
   	
