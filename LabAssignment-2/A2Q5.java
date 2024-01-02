import java.util.Scanner;
public class A2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere: ");
        double  r = sc.nextDouble();
        double SA = 3*Math.PI*r*r;
        double volume = (2.0/3)*Math.PI*r*r;
        System.out.println("The surface area of the hemisphere is : " + SA);
        System.out.println("The volume area of the hemisphere is : " +  volume );








        sc.close();
        
    }
    
}
