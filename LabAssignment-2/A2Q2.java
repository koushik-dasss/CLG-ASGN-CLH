import java.util.Scanner;
public class A2Q2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the distance in km =");
       double d_km = sc.nextDouble(), d_m = d_km*1000,d_feet = d_km*3280.8399,d_inch = d_km*39370.0787,d_cm = d_km*100000;
       System.out.println(d_km+" km is "+d_m+" meters");
       System.out.println(d_km+" km is "+d_feet+" feet");
       System.out.println(d_km+" km is "+d_inch+" inch");
       System.out.println(d_km+" km is "+d_cm+" centimeters");

       

       



    }

    
}
