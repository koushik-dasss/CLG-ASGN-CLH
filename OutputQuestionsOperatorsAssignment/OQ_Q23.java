package OutputQuestionsOperatorsAssignment;

public class OQ_Q23 {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int x=(a++ < b)?a:b; // x =(4 < 5)? 5:5 = ( true )? 5:5 =  5 (If first condition is true , second will be implemented)
        // If second condition is true(here false) , third( here will not be) will be implemented . 
        int y=a+b-x; //  y = 5 + 5 - 5 = 5
        System.out.println("x="+x); // 5
        System.out.println("y="+y); // 5 
        
    }
    
}
