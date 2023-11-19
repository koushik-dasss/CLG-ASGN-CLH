package OutputQuestionsAssignment;

public class OQ_Q26 {
    public static void main(String[] args) {
        int i = 132;
        short s = 15; 
        byte b = (byte) i; // result = (value + 128) % 256 - 128 = ( i + 128 ) % 256 - 128 
        // = ( 132 + 128) % 256 - 128 = ( 260 ) % 256 - 128 = 4 - 128 = -124
        int x = b + s ;  // -124 (int to byte value) + 15 = -109 
        System.out.println("Value of x is " + x); // -109
    }
    
}
