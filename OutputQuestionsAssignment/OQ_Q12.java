package OutputQuestionsAssignment;

public class OQ_Q12 {
    public static void main(String[] args) {
        int x=Integer.MAX_VALUE; // Binary representation(32 bits) of Integer.MAX_VALUE = 
        // 0111 1111 1111 1111 1111 1111 1111  1111
        // 28 bits to be shifted from right 
        // 0000 0000 0000 0000 0000 0000 0000 0111
        // 0111 = 2^2 + 2^1 + 2^0 = 4 + 2 + 1 = 7
        System.out.println(x>>28); // 0111 = 4 + 2 + 1 = 7
    }
    
}
