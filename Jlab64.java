class JLAB64

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		23/1/17
// Purpose :Write a method award() that takes a mark as its argument and returns as its result 
//			a String containing the values of either "Distinction", "Merit1", "Merit2", "Pass" or "Fail" where 
//			these are calculated as follows
//			Distinction	70 - 100
//			Merit1		63 - 69
//			Merit2		55 - 62
//			Pass		40 - 54
//			Fail		Less Than 40


{
	 
	
	public static void award(int mark) 						// parameter	
	
	{
		if(mark>=70)
		{
			System.out.println("Distinction 70-100");
		}
		else if(mark>=63)
		{
			System.out.println("Merit 1 63-69");	
		}
		else if(mark>=55)
		{
			System.out.println("Merit 2 55-62");
		}
		else if(mark >=40)
		{
			System.out.println("Pass 40-54");			//Method
		}
		else if(mark<40)
		{
			System.out.println("You obtained less than 40, therefore you failed");
		}
	}

	public static void main (String args[])
    
    {
    	int mark;
    		
    	System.out.println("Please enter your mark");			//Main
   		mark=EasyIn.getInt();
    	award(mark);											//Call Method
    }  
}