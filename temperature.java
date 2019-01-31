class temperature

// Student Name : 		Trevor Doyle
// Student Id Number : 	CO0170053
// Date :				19/9/2016
// Purpose : 			A program that converts fahrenheit to celcius

{  
      public static void main(String args[])
        {
  	    
  	    int temp1;
  	    int temp2;
	

	System.out.print("Enter temperature");
	temp1 = EasyIn.getInt();
	temp2 = (temp1-32) * 5/9;
	System.out.println("The temperature in celcius is" + temp2);
	
        }
}
