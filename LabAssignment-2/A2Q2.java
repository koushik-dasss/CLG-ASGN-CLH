import java.util.Scanner;
public class A2Q2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       /*System.out.print("Enter the distance in km =");
       double  d_km = sc.nextDouble(); 
       double d_m = d_km*1000;
       double d_feet = d_km*3280.8399;
       double d_inch = d_km*39370.0787;
       double d_cm = d_km*100000;
       System.out.println(d_km+" km is "+d_m+" meters");
       System.out.println(d_km+" km is "+d_feet+" feet");
       System.out.println(d_km+" km is "+d_inch+" inch");
       System.out.println(d_km+" km is "+d_cm+" centimeters"); */
       

       // Using int and double data types  according to their needs . 
       
       int d_km = sc.nextInt();
       int d_m = d_km*1000;
       double d_feet = d_km*3280.8399;
       double d_inch = d_km*39370.0787;
       int d_cm = d_km*100000;
       System.out.println(d_km + " is "+ d_m +" meters ");
       System.out.println(d_km + " is "+ d_feet + " feet ");
       System.out.println(d_km + " is "+ d_inch + " inch ");
       System.out.println(d_km + " is "+ d_cm + " centimeters "); 

       sc.close();

       

       



    }

    
}
