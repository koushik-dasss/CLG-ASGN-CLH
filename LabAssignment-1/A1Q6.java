import java.util.Scanner;
public class A1Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*int Account_No = 123456;
        String name = "Koushik";
        double balance = 7654.98;
        System.out.println("My name is "+name+" bearing  account number "+ Account_No+" having  balance  "+ balance);  */

        // Taking user input via keyboard

        int Account_No = sc.nextInt();
        double balance = sc.nextDouble();
        String name =  sc.nextLine();
        System.out.println("My name is " + name + " bearing account number "+  Account_No +" having balance " + balance );



        sc.close();
        


    }
    
}
