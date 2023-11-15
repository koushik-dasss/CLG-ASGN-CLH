import java.util.Scanner;
public class A1Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*int x=10,y=20,z=0;
        z=x; // z = x = 10
        x=y; // x = y = 20
        y=z; // y = z = 10
        System.out.println("Exchanged value of x is:"+x+"\nExchanged value of y is:"+y); */
        

        // OR(same logic )

        /* int x=10,y=20,z=0;
        z=y; // z = y = 20
        y=x; // y = x = 10
        x=z; // x = z = 20
        System.out.println("Exchanged value of x is:"+x+"\nExchanged value of y is:"+y); */
        



        // Taking input from user via keyboard
        System.out.println("Enter two integers:");
        int a = sc.nextInt(), b = sc.nextInt(), temp;
        System.out.println(" Before swap : a = "+ a + " b = " + b );
        temp = a ;
        a = b ;
        b = temp ;
        System.out.println(" After swap : a = "+  a + " b = " + b );


        








        sc.close();
    }
}