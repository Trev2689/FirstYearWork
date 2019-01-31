class  JLAB31

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		24/10/16
// Purpose : 	Rewrite the following program using a loop structure of your choice. 
//				The program keeps presenting the user with options until the user enters the value 7 to exit

//				1.	Fahrenheit to celcius
//				2.	Celcius to Fahrenheit
//				3.	Inches to centimetres
//				4.	Centimetres to inches
//				5.	Pounds to Kilograms
//				6.	Kilograms to Pounds
//				7.	Exit Program


{		
    public static void main(String[] args)
    {
    	int choice=0;
        int number;
    	
    			
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
        number=EasyIn.getInt();
    	
        double output;
        switch(choice)
            {
            case 1: output=((number-32)*5/9);
                    System.out.print("The temperature in celcius is" + output);
                    break;
            case 2: output=(number*9/5+32);
                    System.out.print("The temperature in fahrenheit is" + output);
                    break;
            case 3: output=(number*0.39);
                    System.out.println("The length in centimetres is" + output);
                    break;
            case 4: output=(number*2.54);
                    System.out.println("The length in inches is" + output);
                    break;
            case 5: output=(number/2.2);
                    System.out.println("The value in kg is" + output);
                    break;
            case 6: output=(number*2.2);
                    System.out.println("The weight in pounds is" + output);
                    break;
            case 7: break;}}
            
        
        }
	
      }  