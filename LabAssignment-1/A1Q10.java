public class A1Q10 {
    public static void main(String[] args){
        // Option-1 (non-optimized code)
        // As more variables are being declared , more space is taken , 
        // as it's being stored in different memory locations. Space Complexity concept
        String S= "1",S2,S3;
        System.out.println(S);
        System.out.println(S+"2"+S);  // "2"/2 as string + string = string , int + string = string ,
        // where + works as concatenation operator
        S2=S+"2"+S;
        System.out.println(S2+"3"+S2);
        S3=S2+"3"+S2;
        System.out.println(S3+"4"+S3);


        





        //Optimized Code (only one variable created , no need of multiple variables)
        String S1="1";
        System.out.println(S1);
        System.out.println(S1+2+S1); // "2"/2 as string + string = string , int + string = string ,
        // where + works as concatenation operator
        S1=S1+2+S1;
        System.out.println(S1+3+S1);
        S1=S1+3+S1;
        System.out.println(S1+4+S1);

        



    }
    
}
