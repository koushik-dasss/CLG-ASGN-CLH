import java.util.Scanner;
public class A4Q3For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 , n = sc.nextInt();
        for ( int ctr = 1  ; ctr<=n ;ctr++  ){
            int  Random_Numbers = (1 + (int) ((n + 1) * Math.random() - 1) );
            System.out.print(Random_Numbers + " " );
            sum+=Random_Numbers;


        }
        System.out.print("\nAverage of "  + n + " random numbers are : ");
        double  average = sum/ n;
        System.out.println(average);




        sc.close();
    }
    
}
