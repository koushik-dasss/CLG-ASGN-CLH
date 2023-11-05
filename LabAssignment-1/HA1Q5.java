public class HA1Q5 {
    public static void main(String[] args){
        // non-optimized code (extra one variable is declared , can be done using 4 variables's arithmetic operations )
        /*int W=10, G=20,K=30,A=40, temp= 0; // USING EXTRA VARIABLE 
        temp=W; // temp = 10
        W=G; // W = 20
        G=K; // G = 30
        K=A; // K = 40
        A=temp; // A = 10
        System.out.println(W);
        System.out.println(G);
        System.out.println(K);
        System.out.println(A);*/


        // optimised code with 4 variables (arithmetic operations)
        // WITHOUT USING EXTRA VARIABLE

        int W=10, G=20,K=30,A=40;
        // the value of W will move to A, A to K, K to G and finally G to W

        W=A+G+K+W; 
        A= W-(G+K+A); // A=10
        K= W-(G+K+A); // K=40
        G= W-(G+K+A); // G=30
        W= W-(G+K+A); // W=20
              

        System.out.println(W);
        System.out.println(G);
        System.out.println(K);
        System.out.println(A);


        
        



    }
    
}
