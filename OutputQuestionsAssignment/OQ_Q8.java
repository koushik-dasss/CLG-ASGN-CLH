package OutputQuestionsAssignment;

public class OQ_Q8 {
    public static void main(String[] args) {
        byte b = 10;
        // b = b + 10 (Compilation error)
        
        /* This code would result in a compilation error. 
        In Java, when you perform arithmetic operations on byte, short, or char types, the result is promoted to an int. 
        Therefore, in the line b = b + 10;, 
        the result of b + 10 is an int, and 
        you cannot assign an int value directly to a byte variable without an explicit cast. */

        // Corrected code:-

        b+=10; // 20               Use of assignment operator 
        b = (byte)(b + 10); //30   Use of explicit typecasting 
        System.out.println(b); 
    }
    
}
