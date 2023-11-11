package ClassworkCodes;

public class PracticalClass4 {
    public static void main(String[] args){
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

        // Swapping three variables using a fourth variable    1.(a <- b <- c)

        int a = 10 , b = 20 , c = 30,d;
        System.out.println("Before swap: a = "+ a +"\t b = "+ b +"\t c = "+ c);
        d=a; // a = 10 , b = 20 , c = 30, d = 10
        a=b; // a = 20 , b = 20 , c = 30 , d = 10
        b=c; // a = 20 , b = 30 , c = 30 ,  d = 10
        c=d; // a = 20 , b = 30 , c = 10 , d = 10
        System.out.println("After swap:  a = "+ a +"\t b = "+ b +"\t c = "+ c);

        // OR(Same method)   2.(a -> b -> c)
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


        // Swapping three variables without  using a fourth variable  1.(q -> r -> s)
        int q = 1 , r = 2 , s = 3;
        System.out.println("Before swap: q = "+ q +"\t r = "+ r +"\t s = "+ s );
        q=q+r+s;
        r=q-(r+s);
        s=q-(r+s);
        q=q-(r+s);
        System.out.println("After swap:  q = "+ q +"\t r = "+ r +"\t s = "+ s );


        // OR(Same method)   2.(t <- u <- v)
        int t = 1 , u = 2 , v =3;
        System.out.println("Before swap: t = "+ t +"\t u = "+ u +"\t v = "+ v );
        v=t+u+v;
        t=v-(t+u);
        u=v-(t+u);
        v=v-(t+u);
        t=v-(t+u);
        System.out.println("After swap:  t = "+ t +"\t u = "+ u +"\t v = "+ v );






        




























    }
    
}
