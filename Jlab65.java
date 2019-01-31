class JLAB65

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		11/1/17
// Purpose :Rewrite the following program using a loop structure of your choice. 
//			But this time you implement a method called menu for the menu option, 
//			and a method for each conversion e.g. fahrToCel(), celToFahr(), inchToCent() etc. 
//			The program keeps presenting the user with options until the user enters the value 7 to exit

//			1.	Fahrenheit to celcius
//			2.	Celcius to Fahrenheit
//			3.	Inches to centimetres
//			4.	Centimetres to inches
//			5.	Pounds to Kilograms
//			6.	Kilograms to Pounds
//			7.	Exit Program 

 	

{	
	public static double fahrToCel(double number)						// parameter	
	
	{
		double output=((number-32)*5/9);
		return output;
	}

	public static double celToFahr(double number)
	{
		double output=(number*9/5+32);
		return output;	
	}


	public static double inchToCent(double number)
	{
		double output=(number*0.39);
		return output;
	}


	public static double centToInch(double number)
	{
		double output=(number*2.54);
		return output;	
	}


	public static double poundToKilo(double number)
	{
		double output=(number/2.2);
		return output;	
	}


	public static double kiloToPound(double number)
	{
		double output=(number*2.2);	
		return output;
	}
	public static void main (String args[])
    

 {
    

	
	
    	int choice=0;
        double number;
    	
    			
    	while(choice!=7){
    	
    	System.out.println("1 Fahrenheit to celcius ");
        System.out.println("2 Celcius to fahrenheit ");
        System.out.println("3 Inches to centimetres ");
        System.out.println("4 Centimetres to inches ");
        System.out.println("5 Pounds to kilograms ");
        System.out.println("6 Kilograms to pounds ");
        System.out.println("Please enter a conversion choice 1-6 ");
        choice=EasyIn.getInt();
        System.out.println("Please enter number to be converted ");
        number=EasyIn.getDouble();
    	
        double output;
        switch(choice)
            {
            case 1: output=fahrToCel(number);
                    System.out.println("The temperature in celcius is " + output);
                    break;
            case 2: output=celToFahr(number);
                    System.out.println("The temperature in fahrenheit is " + output);
                    break;
            case 3: output=inchToCent(number);
                    System.out.println("The length in centimetres is " + output);
                    break;
            case 4: output=centToInch(number);
                    System.out.println("The length in inches is " + output);
                    break;
            case 5: output=poundToKilo(number);
                    System.out.println("The value in kg is " + output);
                    break;
            case 6: output=kiloToPound(number);
                    System.out.println("The weight in pounds is " + output);
                    break;
            case 7: break;}} 
            
        
        }
	
}
		  
		
	