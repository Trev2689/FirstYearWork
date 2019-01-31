class Jlab12

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose :Enter the following values : distance travelled in miles, the amount of time spent on the trip in hours 
//          and the amount of gallons of petrol used. The program should then display , 
//          the average miles per hour and the miles per gallon. 			




{
    public static void main(String[] args)
    {
    	double distance;
    	double time;
    	double petrolUsed;
    	double milesPerHour;
    	double milesPerGallon;
       
         
    	System.out.print("Enter distance travelled(Miles) ") ;  
		distance = EasyIn.getDouble() ;
    	System.out.print("Enter time spent travelling(Hours) ") ;
    	time = EasyIn.getDouble();
    	System.out.print("Enter gallons of petrol used ");
    	petrolUsed= EasyIn.getDouble();
    	milesPerHour=distance/time;
    	milesPerGallon=distance/petrolUsed; 
    	System.out.println("The average Miles Per Hour is"+milesPerHour ) ;
    	System.out.println("The Average Miles Per Gallon is"+milesPerGallon ) ;
    }
}

