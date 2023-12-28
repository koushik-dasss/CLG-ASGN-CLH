public class HA1Q2 {
    public static void main(String[] args){
    
        System.out.println('b'); // answer:- b (only the char value will be printed)
        System.out.println('b'+'c'); // when two char values are involved in an arithmetic expression ,
        //  they are treated as an int data type , so 'b' = 97 , 'c' = 98 
        // 'b' + 'c' = 97 + 98 = 196
        System.out.println((char)('a'+4)); // 'a' will be treated as a character 
        // a = 96
        // (char) ( 97 + 4 ) = (char) (101) = 'e' 
    }
    
}
