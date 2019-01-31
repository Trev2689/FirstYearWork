class JLAB51

// Student Name : 	Trevor Doyle
// Student Id Number : 	C00170053
// Date :		05/12/16
// Purpose : Write a program which will input a string from the keyboard, 
//           and output the number of separate words, where a word is one 
//			or more characters separated by spaces. Your program should 
//          only count as words groups of characters in the ranges A..Z and a..z	
{

public static void main (String args[])
    {

	   String sentence;
	   String fstWd ;
	   int count;
	   int spPos ;
	   
	   System.out.println("Please enter a string");
	   sentence =  EasyIn.getString();

       System.out.println("\n\n\n") ;
        spPos = sentence.indexOf(' ') ;
      while(spPos > -1)
      	{
             // Get first word
      		fstWd = sentence.substring(0,spPos) ;
      		
      		System.out.print("\n\t" + fstWd) ;
      		
      		// Remove the first word
      		sentence = sentence.substring(spPos+1) ;
      		spPos = sentence.indexOf(' ') ;
      	}
      
      /*
      
      
        count=0;
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i) != ' ')
            {
                count++;
                while(sentence.charAt(i) != ' ' && i < sentence.length()-1)
                {
                    i++;
           		 }
        }
     }
        System.out.println("The number of seperate words in your sentence is " +count) ;"Write a program which will input a string from the keyboard" */
        System.out.println("\n\n\n") ;
    }
}	