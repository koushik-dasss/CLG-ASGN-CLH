package OutputQuestionsOperatorsAssignment;

public class OQ_Q38 {
    public static void main(String[] args) {
        int a=12+21*3-9/2; // a = 12 + 63 - 4 = 75 - 4 = 71
        int b=14-32*4+175/8-3; // b = 14 - 128 + 21 - 3 = -96
       
        boolean p=(++a>71&&--b<20); // 
        System.out.println(p);
        boolean p1=(b-- == -99 || a-- > 100);
        System.out.println(p1);
    }
    
}
