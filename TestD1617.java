class Test1D1617

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				30/11/16
// Purpose : 			Class test 1	

		
{		
    public static void main(String[] args)
    {
    	//variables
    	String team1;
    	String team2;
    	int convTry1;
    	int convTry2;
    	int unconvTry1;
    	int unconvTry2;
    	int penalty1;
    	int penalty2;
    	int finalScore1;
    	int finalScore2;
    	int finalScore3;
    	int losingMargin;
    	
    			
    	//user input
    	System.out.print("Please enter the name of team 1 ");
    	team1=EasyIn.getString();
    	System.out.println("Please enter the name of team 2 ");
    	team2=EasyIn.getString();
    	System.out.print("Enter the amount of converted trys scored by "+ team1);
    	convTry1=EasyIn.getInt();
    	System.out.print("Enter the amount of converted trys scored by "+ team2);
    	convTry2=EasyIn.getInt();
    	System.out.print("Enter the amount of unconverted trys scored by "+ team1);
    	unconvTry1=EasyIn.getInt();
    	System.out.print("Enter the amount of unconverted trys scored by "+ team2);
    	unconvTry2=EasyIn.getInt();
    	System.out.print("Enter the amount of Penalties scored by "+ team1);
    	penalty1=EasyIn.getInt();
    	System.out.print("Enter the amount of Penalties scored by "+ team2);
    	penalty2=EasyIn.getInt();
    	
    	//calculations
    	finalScore1=convTry1+unconvTry2+penalty1;
    	finalScore2=convTry2+unconvTry2+penalty2;
    	finalScore3=finalScore1+finalScore2;
    	
    	
    	//if statement calculations & output
    	
    	if(finalScore1>finalScore2)
    	{
    		
    		losingMargin=finalScore1-finalScore2;
    		System.out.println("The final score is"+team1 +finalScore1 +team2 +finalScore2);
    		System.out.println("The losers were"+team2+losingMargin);
    	}
    	else if(finalScore2>finalScore1)
    	{
    		
    		losingMargin=finalScore2-finalScore1;
    		System.out.println("The final score is" +team1 +finalScore1+team2 +finalScore2);
    		System.out.println("The losers were"+team1 +losingMargin);
    	}
    	if(finalScore1==finalScore2)
    	{
    		System.out.println("The final score is"+team1 +finalScore1+team2 +finalScore2);
    		System.out.println("The match was a draw");
    	}
    	
    	
    }
    		
    			
}
