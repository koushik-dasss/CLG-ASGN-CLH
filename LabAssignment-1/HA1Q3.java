public class HA1Q3 {
    public static void main(String[] args){
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(a+1);
        System.out.println(2-a);
        System.out.println(-2-a);
        System.out.println(2*a);
        System.out.println(4*a);


        float maxFloat = Float.MAX_VALUE;
        float overflowedResult1 = maxFloat * 2; // Results in positive infinity
        System.out.println(overflowedResult1);

        float minFloat = Float.MIN_VALUE;
        float overflowedResult2 = minFloat * 2 ;
        System.out.println(overflowedResult2);


    }
    
}
