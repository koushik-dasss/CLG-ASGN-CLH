public class A2CLAQ7 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]) , b = Integer.parseInt(args[1]) , c = Integer.parseInt(args[2]);
        boolean b1 = (a <= b*c) , b2 = (b <= a*c) , b3 = (c <= a*b);
        System.out.println(b1 || b2 || b3 );



    }
    
}
