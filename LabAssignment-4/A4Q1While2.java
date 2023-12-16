import java.util.Scanner;
public class A4Q1While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt() ;
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt() ,sum = 0;
        while (a<=b){
            System.out.print(a  + "\t");
            sum+=a;
            a+=c;
        }
        System.out.println("\nThe sum of number displayed is  " + sum );










        sc.close();
    }
    
}
