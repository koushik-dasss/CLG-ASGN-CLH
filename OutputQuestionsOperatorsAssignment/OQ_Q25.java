package OutputQuestionsOperatorsAssignment;

public class OQ_Q25 {
    public static void main(String[] args) {
        long l = 55;
        int i = 44;
        short s = 33;
        byte b = 22;
        i = (int) l;   // Explicit type casting from long to integer
        s = (short) i; // Explicit type casting from integer to short
        b = (byte) s;  // Explicit type casting from short to byte 
        System.out.println("l = " + l); // 55
        System.out.println("i = " + i); // 55
        System.out.println("s = " + s); // 55
        System.out.println("b = " + b); // 55
        
    }
    
}
