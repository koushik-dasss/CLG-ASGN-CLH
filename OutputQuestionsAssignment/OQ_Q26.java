package OutputQuestionsAssignment;

public class OQ_Q26 {
    public static void main(String[] args) {
        int i = 132; // integer declared
        short s = 15;  // short declared 
        byte b = (byte) i;     //  ( 132 + 128) % 256 - 128 = ( 260 ) % 256 - 128 = 4 - 128 = -124
 
        
        
        // Explicit type casting from integer( larger data type) to byte( smaller data type)
        // The value of integer is out of ranges of byte , so formula is to be used
        
        // Formula :- Wrapped value (Integer to byte , out of range for byte) = ( integer value + 128) % 256 - 128
        
        // Same formula for Integer to short and char , if the value ranges outside the range of short and char 
        // after conversion ( Wrapping of value)


        
    
        int x = b + s ;  // -124 (int to byte value) + 15 = -109 
        System.out.println("Value of x is " + x); // -109

        
    }
    
}
