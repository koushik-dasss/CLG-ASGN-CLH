package OutputQuestionsAssignment;

public class OQ_Q22 {
    public static void main(String[] args) {
        int a=10;
        int b=6;
        int c=30;
        System.out.println(a > b || a < c); // (true) = true
        // (true) = true (if both are false , then false , otherwise true , in LOGICAL OR)
        System.out.println(a > b | a < c); // (true or true ) = true (In BITWISE OPERATORS , BOTH THE CONDITIONS WILL BE EVALUATED)
        System.out.println(a > b || a++ < c); // (true) = true (if both are false , then false , otherwise true , in LOGICAL OR)
        // so , value of a will  not be incremented
        System.out.println(a); // a = 10
        System.out.println(a > b | a ++ < c); // (true OR(Bitwise) true ) = true (In BITWISE OPERATORS , BOTH THE CONDITIONS WILL BE EVALUATED)
        // so , value of a will  be incremented
        System.out.println(a); // a = 11
    }
    
}
