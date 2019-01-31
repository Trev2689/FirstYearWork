class Jlab11

// Student Name : 		Trevor Doyle
// Student Id Number : 	C00170053
// Date :				26/9/16
// Purpose : Input a value in inches, convert it to centimetres and display the centimetre equivalent on the screen. 
// (2.54 centimetres per inch)			




{
    public static void main(String[] args)
    {
    	double inches;
        double centimetres;
      
       
         
    	System.out.print("Enter inches ") ;  
		inches = EasyIn.getDouble();
		centimetres=inches*2.54;
    	System.out.println("The value in centimetres is "+ centimetres ) ;
    }
}

