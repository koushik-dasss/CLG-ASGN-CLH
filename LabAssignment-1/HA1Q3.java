public class HA1Q3 {
    public static void main(String[] args){

        //  Max. and Min. Values of Integer class in JAVA
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        
        int a = Integer.MAX_VALUE; // 2147483647
        System.out.println(a); // 2147483647
        System.out.println(a+1); // 2147483647 + 1 = -(Integer.MIN_VALUE) = -(2147483648) = -2147483648
        System.out.println(2-a); // -(21474483647-2) = -21474483647
        System.out.println(-2-a); // -(21474483647+2) = 21474483649
        System.out.println(2*a); // -2 (formula = even no.* Integer.MAX_VALUE = negative of that even no.)
        System.out.println(4*a); // -4 (formula = even no.* Integer.MAX_VALUE = negative of that even no.)


        


    }
    
}
