import java.util.Scanner;
public class A4Q6While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base  : ");
        int base  = sc.nextInt() ;
        System.out.println("Enter the power :");
        int power = sc.nextInt();
        int i = 1 , result = 1  ;
        while (i<=power){
            result *= base;
            i++;
        }
        System.out.println(result);



        sc.close();
    }

}
