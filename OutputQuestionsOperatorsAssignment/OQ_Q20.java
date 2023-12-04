package OutputQuestionsOperatorsAssignment;

public class OQ_Q20 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a < b && a < c); 
        // false and(Logical) true = false ( first result is false in AND operator = final result is false)
        System.out.println(a < b & a < c); // false  and(Bitwise) true = false 

    }
    
}
