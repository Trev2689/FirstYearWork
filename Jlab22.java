class Jlab22

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose :	   		Write a program where the user enters 3 exam marks. 
//                      Programming, Maths and Hardware. The program will then 
//                  	calculate their average mark and indicate whether the average mark is a :

//		 				Distinction	70 - 100
//						Merit1		63 - 69
//						Merit2		55 - 62
//						Pass		40 - 54
//						Fail		Less Than 40
{
    public static void main(String[] args)
    {
    	int programming;
    	int maths;
    	int hardware;
    	int average;
    	 
    	System.out.print("Please enter programming marks ") ;  
		programming = EasyIn.getInt() ;
		System.out.print("Please enter maths marks ");
		maths=EasyIn.getInt();
		System.out.print("Please enter hardware marks ");
		hardware=EasyIn.getInt();

    	average = (programming+maths+hardware)/3;

    	System.out.print("Your average mark is " + average);
    	
		if(average < 40)
    	{
    		System.out.print("\nyou have failed ");
    	}
    	
    	else if(average <= 54)
    	{
    		System.out.print("\nyou have passed ");
    	}
    	
    	else if (average >= 55)
    	{
    		System.out.print("\nyou have obtained a merit 2 ");
    	}
    	
    	
    	else if(average >= 63)
    	{
    		System.out.print("\nyou have obtained a merit 1 " );
    	}
    	
        else if(average >= 70)
    	{
    		System.out.print("\nyou have obtained a distinction ");
    	}
    	
    	System.out.print("\n\n\n\n\t\t" ) ;
        
        
    }
}

   	