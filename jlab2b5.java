class JLAB2B5

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		17/10/16
// Purpose : 		Write a program that takes as input the number of a month and outputs the name of that month. 
//                      (Write this with and if statement and a switch statement)

{		
    public static void main(String[] args)
    {
    	int month;
    	
    			
    	
    	System.out.print("Please enter number the number of chosen month ");
    	month= EasyIn.getInt();
        switch(month)
            {
            case 1: //month=January;
            		System.out.print("The month is January");
                    break;
            case 2: //month=February;
            		System.out.print("The month is February");
                    break;
            case 3: //month=March;
            		System.out.print("The month is March");
                    break;
            case 4: //month=April;
            		System.out.print("The month is April");
                    break;
            case 5: //month=May;
            		System.out.print("The month is May");
                    break;
            case 6: //month=June;
            		System.out.print("The month is June");
                    break;
            case 7: //month=July;
            		System.out.print("The month is July");
                    break;
            case 8: //month=August;
            		System.out.print("The month is August");
                    break;
            case 9: //month=September;
            		System.out.print("The month is September");
                    break;
            case 10://month=October;
            		System.out.print("The month is October");
                    break;
            case 11://month=November;
            		System.out.print("The month is November");
                    break;
            case 12://month=December;
            		System.out.print("The month is December");
                    break;
            }
           // System.out.print("The month is" + month);
            
        if (month==1) 
    	{
    		System.out.println("The month chosen is January");	
    	}
    	else if (month==2) 
    	{
    		System.out.println("The month chosen is February");	
    	}
        else if (month==3)
        {
             System.out.println("The month chosen is March");
        }
        else if (month==4)
        {
              System.out.println("The month chosen is April");    
        }
        else if (month==5)
        {
              System.out.println("The month chosen is May");    
        }
        else if (month==6)
        {
              System.out.println("The month chosen is June");    
        }
        else if (month==7)
        {
              System.out.println("The month chosen is July");    
        }
        else if (month==8)
        {
              System.out.println("The month chosen is August");    
        }
        else if (month==9)
        {
              System.out.println("The month chosen is September");    
        }
        else if (month==10)
        {
              System.out.println("The month chosen is October");    
        }
        else if (month==11)
        {
              System.out.println("The month chosen is November");    
        }
        else if (month==12)
        {
              System.out.println("The month chosen is December");
        }
   
    }
 }