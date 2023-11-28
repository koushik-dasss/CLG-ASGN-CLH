package OutputQuestionsAssignment;

public class OQ_Q30 {
    public static void main(String[] args) {
        int v=10; // v = 10 
        System.out.println(v%=3*4);int x=11; // v = v % 12 = 10 % 12 = 10 , x = 11 
        System.out.println(-x--); System.out.println(x); // -x-- = -(x--) = -(11) = -11 , x = 10
        x = -x--; // -x-- = -(x--) = -(10) = -10
        System.out.println(x); int y = -x--; // x = -10  , y = -x-- = -(x--) = -(-10) = 10 
        System.out.println(x+" "+y); // -11 10
    }
    
}
