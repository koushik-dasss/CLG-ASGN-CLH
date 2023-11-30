import java.util.Scanner;
public class A2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere: ");
        double radius = sc.nextDouble();
        double area =  3*Math.PI*radius*radius ;
        double volume = (2.0/3)*Math.PI*radius*radius*radius;
        System.out.println("The surface area of the hemisphere is :" + area );
        System.out.println("The volume of the hemisphere is :"  + volume );








        sc.close();
        
    }
    
}
