import java.util.Scanner;
public class A4Q1For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers : ");
        int FirstNumber = sc.nextInt()  , SecondNumber = sc.nextInt() ;
        System.out.println("Enter the increment value : ");
        int IncrementThirdNumber = sc.nextInt(), sum = 0;
        for (int i = FirstNumber ; i<= SecondNumber ; i+=IncrementThirdNumber){
            System.out.print(i + "  ");
            sum+=i;

        }

        System.out.println("\nThe sum of number displayed is " +  sum );















        sc.close();
    }
    
}
