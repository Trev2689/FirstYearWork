class Test5D1617 
{

  // Student Name : 		Trevor Doyle
  // Student Id Number : 	C00170053
  // Date :					05/04/17
  // Purpose : 				Test on objects 
	
    
    
    
    public static void main(String[] args)

    {	
    	Customer custArray[];
    	int noOfElements;
		custArray = new Customer[3]; // create array
    	noOfElements = 0;
    	int index;
    	String currentName;
    	String currentId;
    	int currentBalance;
    	int arrindex; //array index
    	int serindex; //inner index to search   
    	
    	for (index = 0; index < 3; index ++)
    		{
    		System.out.print("Enter name ");
    		currentName = EasyIn.getString();
   			System.out.print("Enter Id ");
   	 		currentId = EasyIn.getString();
   			System.out.print("Enter balance ");
   		 	currentBalance = EasyIn.getInt();					//(Setting array obejects)
   		 	System.out.println();
   		 	custArray[index] = new Customer(); 					//create object
    		custArray[index].setName(currentName);
    		custArray[index].setId(currentId);
    		custArray[index].setBalance(currentBalance);
    		noOfElements ++;
    		}
    		
    		
    /*	for (arrindex = 0; arrindex < custArray.length; arrindex ++)
 			{
   			for (serindex= 0; serindex < custArray[arrindex].length(); serindex ++)  The beginning of a non finished nested loop to search																		
    	 	{
    	      System.out.println(custArray[arrindex].charAt(serindex));	
    	  	}	
 			}*/

		System.out.println("The customer with the longest name is" +custArray[1]); 
    	
    }

}
