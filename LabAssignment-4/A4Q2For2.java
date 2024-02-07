import java.util.Scanner;

public class A4Q2For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt(), sum = 0 , r ;
        sc.close();
        System.out.print(n);
        for ( ; n!=0 ; n/=10) {
            r = n % 10;
            sum += r;


        }if (sum%9 == 0){
            System.out.println(" is divisible by 9 ");
        } else{
            System.out.println(" is not divisible by 9");

        }

        
        
        
    }
    
}
