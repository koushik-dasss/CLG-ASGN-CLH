package OutputQuestionsAssignment;

public class OQ_Q21 {
    public static void main(String[] args) {
        int a=10; 
        int b=5;
        int c=20;
        System.out.println(a < b&&a++ < c); // ( false ) = false 
        // During the use of AND (Logical) operator , if the first statement's(relation) result is false
        // then final result is false, 
        // no next statement(relation) will be executed , so a will not be incremented , a will have it's old value
        System.out.println(a);  // a = 10
        System.out.println(a < b&a++ < c); // (false AND(bitwise) true ) = false
        // in Bitwise AND if both the conditions are true , then only true, otherwise false.
        System.out.println(a);  // 11
    }
    
}
