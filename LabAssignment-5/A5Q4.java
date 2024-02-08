import java.util.Scanner;
public class A5Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i = m ; i<= n ; i++){
            int f = 1 ;
            System.out.print("Factorial of "+ i + " is :");
            for(int j = 1 ; j<=i ; j++){
                f*=j;
            }
            System.out.println(f);
        }
        sc.close();
    }
    
}
