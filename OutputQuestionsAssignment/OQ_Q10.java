package OutputQuestionsAssignment;

public class OQ_Q10 {
    public static void main(String[] args) {
        // Use of Logical AND (&&)

        /*int a = 2;
        int b = 3;
         int result = a && b; // can't use logical operator directly on  integer operands. (undefined on integer operands)
        System.out.println(result); */
       
        // Use of bitwise AND (&)

        int a = 2;
        int b = 3;
        int result = a & b ; // 2 & 3 = 2 
        // Bitwise AND (&) working -  if both the bits are 1(true) , then only 1(true) will be the output , otheriwse 0(false)
        System.out.println(result);
    }
    
}
