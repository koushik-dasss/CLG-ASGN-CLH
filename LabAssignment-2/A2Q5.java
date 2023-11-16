import java.util.Scanner;
public class A2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the hemisphere: ");
        double radius = sc.nextDouble(), area =  3*Math.PI*radius*radius , volume =  (2.0/3.0)*Math.PI*radius*radius*radius;
        System.out.println("The surface area of the hemisphere is :" + area );
        System.out.println("The volume of the hemisphere is :"  + volume );








        sc.close();
        
    }
    
}
