public class A2CLAQ5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(args[2]);
        int MaxValue = Math.max(a,(Math.max(b,c))) ;
        int MinValue = Math.min(a,(Math.min(b,c)));
        int MiddleValue = (a+b+c) - MaxValue - MinValue ;
        System.out.println("The ascending order is : " + MinValue + "\t" + MiddleValue + "\t" + MaxValue );


    }
    
}
