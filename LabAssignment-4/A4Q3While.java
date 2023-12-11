import java.util.Scanner;
public class A4Q3While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (ctr<=n) {
            int  Random_Numbers = (1 + (int) ((n + 1) * Math.random() - 1) );
            System.out.print(Random_Numbers + " " );
            sum+=Random_Numbers;
            ctr+= 1;

        }
        System.out.print("\nAverage of "  + n + " random numbers are : ");
        double  average = sum/ n;
        System.out.println(average);










        sc.close();
    }
    
}
