public class A2Q7 {
    public static void main(String[] args) {

        //Non-Optimized method(Incrementing the values with separate lines of code)

       /*  System.out.println("a\tb\tpow(a,b)");
        int a = 1 , b = 2 ;
        System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a,b)));
        a+=1;
        b+=1;
        System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a,b)));
        a+=1;
        b+=1;System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a,b)));
        a+=1;
        b+=1;System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a,b)));
        a+=1;
        b+=1;System.out.println(a+"\t"+b+"\t"+(int)(Math.pow(a,b)));
        a+=1;
        b+=1;    */
        // Optimized method(Incrementing the values of a and b , by using postfix incrementation operator)
        System.out.println("a"+"\tb"+"\tpow(a,b)");
        int a = 1 , b = 2 ;
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
   }
    
}
