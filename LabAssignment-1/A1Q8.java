import java.util.Scanner;
public class A1Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*int x=10, y=20;
        x=x+y; //10+20=30
        y=x-y; //30-20=10
        x=x-y; //30-10=20
        
        System.out.println("Exchanged value of x is : "+ x+"\nExchanged value of y is : "+y);*/


        /*int x=10,y=20;
        y=x+y; //10+20=30
        x=y-x; //30-10=20
        y=y-x; //30-20=10
        System.out.println("Exchanged value of x is:"+x+"\nExchanged value of y is:"+y);*/

        // Taking input from user via keyboard
        System.out.println("Enter two inetegrs:");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before swap :  a = "+ a + " b = " + b  );
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("After swap  :  a = "+ a + " b = " + b  );

        sc.close();

    }
    
}

        

        

    
    

