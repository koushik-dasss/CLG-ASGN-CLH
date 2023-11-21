package OutputQuestionsAssignment;

public class OQ_Q13 {
    public static void main(String[] args) {
        int x=10,y=5;
        System.out.println(x++^++y|(x=y)&101); // ( (10 ^ 6)|(6) & 101 ) = 12 | (6) & 101 = 12 | 4 = 12       
    }
    
}
