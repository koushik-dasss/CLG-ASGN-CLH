public class HA1Q5 {
    public static void main(String[] args){
        // non-optimized code (extra one variable is declared , can be done using 4 variables's arithmetic operations )
        int W=10, G=20,K=30,A=40, c= 0;
        c=W;
        W=G;
        G=K;
        K=A;
        A=c;
        System.out.println(W);
        System.out.println(G);
        System.out.println(K);
        System.out.println(A);


        // optimised code with 4 variables (arithmetic operations)

        W=W+G;
        G=W-G;
        W=W-G;

        G=G+K;
        K=G-K;
        G=G-K;

        K=A+K;
        A=A-K;
        K=A-K;

        A=A+W;
        W=A-W;
        A=A-W;


        
        



    }
    
}
