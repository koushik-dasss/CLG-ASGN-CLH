package OutputQuestionsAssignment;

public class OQ_Q36 {
    public static void main(String[] args) {
/*      int a, b, result;
        a=10; b=20;
        result=(b>=a); // result variable is declared here of int type and it can't store value of boolean type
        System.out.println(result);          */
        
        
        // Corrected code:-
        int a, b  ; // two variables of int type are declared in one statement
        a=10;b=20;  // ; is to be used while storing two values instead of , which indicates end of a statement 
        // a = 10 ;
        // b = 20 ;
        boolean result = (b>=a); // result variable is of boolean type and is storing the value true in it 
        System.out.println(result); // true

    }
    
}
