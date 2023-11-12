package ClassworkCodes;
import java.util.Scanner;
public class PracticalClass4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Swapping two variables using a third variable 


        // Method -1 

        int x = 10, y = 20, z;
        System.out.println("Before swap: x = "+ x +"\t y = "+ y);
        z=x; // x = 10 , y = 20 , z = 10
        x=y; // x = 20 , y = 20 , z = 10
        y=z; // x = 20 , y = 10  , z = 10
        System.out.println("After swap:  x = "+ x +"\t y = "+ y);

        // OR (same method with only different variable being used )
        int m = 1000, n = 2000, o;
        System.out.println("Before swap: m = "+ m +"\t n = "+ n);
        o=n; // m = 1000 , n = 2000 , o = 2000
        n=m; // m = 1000 , n = 1000 , o = 2000
        m=o; // m = 2000 , n = 1000 , o = 2000
        System.out.println("After swap:  m = "+ m +"\t n = "+ n);

        // Swapping three variables using a fourth variable    1.( c <- a <- b <- c) Reverse swapping

        int a = 10 , b = 20 , c = 30,d;
        System.out.println("Before swap: a = "+ a +"\t b = "+ b +"\t c = "+ c);
        d=a; // a = 10 , b = 20 , c = 30, d = 10
        a=b; // a = 20 , b = 20 , c = 30 , d = 10
        b=c; // a = 20 , b = 30 , c = 30 ,  d = 10
        c=d; // a = 20 , b = 30 , c = 10 , d = 10
        System.out.println("After swap:  a = "+ a +"\t b = "+ b +"\t c = "+ c);

        // OR(Same method)   2.(a -> b -> c -> a) Forward swapping 
        int e = 5 , f = 6 , g = 7,h;
        System.out.println("Before swap: e = "+ e +"\t f = "+ f +"\t g = "+ g);
        h=g;
        g=f;
        f=e;
        e=h;
        System.out.println("After swap:  e = "+ e +"\t f = "+ f +"\t g = "+ g);



        // Swapping two variables without  using a third variable

        // Method-1
        int i = 1 , j = 2;
        System.out.println("Before swap: i = "+ i +"\t j = "+ j);
        i=i+j; // i = 3 , j = 2
        j=i-j; // i = 3 , j = 1
        i=i-j; // i = 2 , j = 1
        System.out.println("After swap:  i = "+ i +"\t j = "+ j);


        // OR (same method with only different variable being used ) 
        int k = 1 , l = 2;
        System.out.println("Before swap: k = "+ k +"\t l = "+ l);
        l=k+l; // k = 1 , l = 3
        k=l-k; // k = 2 , l = 3
        l=l-k; // k = 2 , l = 1
        System.out.println("After swap:  k = "+ k +"\t l = "+ l);


        // Swapping three variables without  using a fourth variable  1.(q -> r -> s -> q) Forward swapping
        int q = 1 , r = 2 , s = 3;
        System.out.println("Before swap: q = "+ q +"\t r = "+ r +"\t s = "+ s );
        q=q+r+s; // q = 1 + 2 + 3 =6
        r=q-(r+s); // r = 6 - (2+3) = 1
        s=q-(r+s); // s = 6 - (1+3) = 2
        q=q-(r+s); // q = 6 - (1+2) = 3
        System.out.println("After swap:  q = "+ q +"\t r = "+ r +"\t s = "+ s );


        // OR(Same method)   2.( v <- t <- u <- v) Reverse swapping
        int t = 1 , u = 2 , v =3;
        System.out.println("Before swap: t = "+ t +"\t u = "+ u +"\t v = "+ v );
        v=t+u+v; // v = 1 + 2 + 3 = 6
        u=v-(t+u); // u = 6-(1+2) = 3
        t=v-(t+u); // t = 6-(1+3) = 2
        v=v-(t+u); // v = 6-(2+3) = 1
        System.out.println("After swap:  t = "+ t +"\t u = "+ u +"\t v = "+ v );

        // Swapping two variables by taking user's input via keyboard

        
        System.out.println("Enter two integers:");
        int v1 = sc.nextInt() , v2 = sc.nextInt(), temp1;
        System.out.println("Before swap : v1 = "+ v1 +"\t v2 = " + v2  );
        temp1 = v1;
        v1 = v2;
        v2 = temp1;
        System.out.println("After swap :  v1 = "+ v1 +"\t v2 = " + v2  );




        System.out.println("Enter two integers:");
        int a1 = sc.nextInt() , a2 = sc.nextInt(), temp2;
        System.out.println("Before swap : a1 = "+ a1 +"\t a2 = " + a2  );
        temp2 = a2;
        a2 = a1;
        a1 = temp2;
        System.out.println("After swap :  a1 = "+ a1 +"\t a2 = " + a2  );


        // Swapping three variables by taking user's input via keyboard (Forward swapping)
        
        
        System.out.println("Enter three integers:");
        int b1 = sc.nextInt() , b2 = sc.nextInt() , b3 = sc.nextInt(), temp3;
        System.out.println("Before swap : b1 = "+ b1 +"\t b2 = " + b2 +"\t b3 = " + b3 );
        temp3 =b1;
        b1=b2;
        b2=b3;
        b3=temp3;
        System.out.println("After swap :  b1 = "+ b1 +"\t b2 = " + b2 +"\t b3 = " + b3 );

        // Backward Swapping 

        System.out.println("Enter three integers:");
        int c1 = sc.nextInt() , c2 = sc.nextInt() , c3 = sc.nextInt(), temp4;
        System.out.println("Before swap : c1 = "+ c1 +"\t c2 = " + c2 +"\t c3 = " + c3 );
        temp4 = c3;
        c3=c2;
        c2=c1;
        c1=temp4;
        System.out.println("After swap :  c1 = "+ c1 +"\t c2 = " + c2 +"\t c3 = " + c3 );


        // Swapping two variables without using temporary variable by using user's input via keyboard

        System.out.println("Enter two integers:");
        int d1 = sc.nextInt(), d2 = sc.nextInt();
        System.out.println("Before swap : d1 = "+ d1 +"\t d2 = " + d2  );
        d1 = d1 + d2;
        d2 = d1 - d2;
        d1 = d1 - d2;
        System.out.println("After swap :  d1 = "+ d1 +"\t d2 = " + d2  );


        // Swapping three variables without using temporary variable by using user's input via keyboard 
        
        // (Foraward swapping)
        
        System.out.println("Enter three integers:");
        int e1 = sc.nextInt(), e2 = sc.nextInt(),  e3 = sc.nextInt();
        System.out.println("Before swap : e1 = "+ e1 +"\t e2 = " + e2 + "\t e3 = " + e3  );
        e1 = e1 + e2 + e3;
        e2 = e1 - (e2 + e3);
        e3 = e1 - (e2 + e3);
        e1 = e1 - (e2 + e3);
        System.out.println("After swap :  e1 = "+ e1 +"\t e2 = " + e2 + "\t e3 = " + e3  );


        System.out.println("Enter three integers:");
        int f1 = sc.nextInt(), f2 = sc.nextInt(), f3 = sc.nextInt();
        System.out.println("Before swap : f1 = "+ f1 +"\t f2 = "+ f2 +"\t f3 = "+ f3);
        f3 = f1 + f2 + f3;
        f2 = f3 - (f1 + f2);
        f1 = f3 - (f1 + f2);
        f3 = f3 - (f1 + f2);
        System.out.println("After swap :  f1 = "+ f1 +"\t f2 = " + f2 + "\t f3 = " + f3  );


        sc.close();


























        






















        




























    }
    
}
