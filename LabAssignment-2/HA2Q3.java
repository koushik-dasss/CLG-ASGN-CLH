import java.util.Scanner;
public class HA2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of point A : ");
        double x1 = sc.nextDouble() , y1 = sc.nextDouble();
        System.out.println("Enter the co-ordinates of point B : ");
        double x2 = sc.nextDouble() , y2 = sc.nextDouble();
        System.out.println("Enter the co-ordinates of point C : ");
        double x3 = sc.nextDouble() , y3 = sc.nextDouble();
        double b = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        double a = Math.sqrt(Math.pow(x3-x1,2)+ Math.pow(y3-y1,2));
        double c = Math.sqrt(Math.pow(x3-x2,2)+ Math.pow(y3-y2,2));
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the rectangle is : " + area );






        










        sc.close();

        
    }
    
}
