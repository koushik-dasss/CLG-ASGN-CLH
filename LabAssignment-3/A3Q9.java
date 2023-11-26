import java.util.Scanner;
public class A3Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a,b,c :  " );
        int a = sc.nextInt(), b = sc.nextInt() , c = sc.nextInt();
        int MaxValue = Math.max(a,Math.max(b,c));
        int MinValue = Math.min(a,Math.min(b,c));
        int SecondMaxValue = (a + b + c) - MaxValue - MinValue ;
        System.out.println("Largest number : " + MaxValue);
        System.out.println("2nd largest number: " + SecondMaxValue);











    sc.close();
    }
}
