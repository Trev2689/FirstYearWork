import jeliot.io.*;

class SimpleExample 
{
    static void main() 
    {
        double inPutA ;
        int inPutB ;
        double result ;

        // Input
        inPutA = Input.readInt();
        inPutB = Input.readInt();
        
        // Calculations
        result = (6+inPutA) / inPutB ;
        
        // Output
        Output.println("Answer is : " + result);
    }
} 
