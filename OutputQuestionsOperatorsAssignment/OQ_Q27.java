package OutputQuestionsOperatorsAssignment;

public class OQ_Q27 {
    public static void main(String[] args) {
        long l = 30; // long declared
        int i = 50;  // integer declared
        short s = 60;// short declared
        byte b = 70; // byte declared 
        byte sum = (byte)(l + i + s + b); 
        // sum = byte (30+50+60+70) = byte (210) = (210 + 128) % 256 - 128 = 338 % 256 - 128 = 82 - 128 = -46
        System.out.println("Sum = " + sum); // -46
    }
    
}
