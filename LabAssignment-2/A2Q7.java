public class A2Q7 {
    public static void main(String[] args) {
        System.out.println("a"+"\tb"+"\tpow(a,b)");
        int a = 1 , b = 2 ;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));

    }
    
}
