package OutputQuestionsOperatorsAssignment;

public class OQ_Q14 {
    public static void main(String[] args) {
        int x=-4,y=4;
        System.out.println((x>>>30)+" "+(x>>30)+" "+(y>>1)); // ( (3) + " " + (-1) + " " + (2) )  = 3 -1 2 
        
        // x>>>30 = -4>>>30
        // 4 = 0000 ..... 0100 , -4 = 1111 ...... 1100
        // After shifting 30 bits from right , it's 11 (2+1) = 3 , 0000 ..... 0011 = filled with zero 
        // >>>   always give postiive result as 1 is never the msb , it's always 0.
        
        
        // x>>30 = -4>>30
        // 4 = 0000 ..... 0100 , -4 = 111 ........ 1100
        // After shifting 30 bits , the signed bit(msb) is to be added in the 30 bits  vacant places
        // 1111 ..... 1111 = 32 1s = -1
        
        // y>>1 = 4>>1
        // 4 = 0000 ..... 0100
        // After shifting 1 bit from right , 0010 = 2
        
        
    }
    
}
