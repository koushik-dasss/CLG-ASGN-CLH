package OutputQuestionsAssignment;

public class OQ_Q15 {
    public static void main(String[] args) {
        int x=5; // x = 5 
        int y=x++ + ++x + ++x; // y = 5 + 7 + 8 = 20
        int z=--y + x++ + y++; // z = 20 + 8 + 19 = 47 
        int p=z++ - (z%10) + (p=z); // p = 47 - (48%10) +(48) = 47 - 8 + 47 = 86 
        // (p==z) or z++ , which one has higher priority , there is no guarantee , as it varies according to compiler
        // Here , (p==z) is compiled first and then the value of z is incremented 
        System.out.println(x+" "+y+" "+z+" "+p);  
    }
    
}
