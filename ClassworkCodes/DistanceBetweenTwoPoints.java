
package ClassworkCodes;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of point A: ");
        double x1 = sc.nextDouble() , y1 = sc.nextDouble();
        System.out.println("Enter the co-ordinates of point B: ");
        double x2 = sc.nextDouble() , y2 = sc.nextDouble();
        System.out.println(Math.sqrt(Math.pow(x2 - x1,2)+Math.pow(y2 - y1, 2)));

        sc.close();




    }
    
}
