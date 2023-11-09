import java.util.Scanner;
public class A2Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit:");
        double fahrenheit = sc.nextDouble(), celsius = (fahrenheit-32) *(5.0/9);
        System.out.println(fahrenheit+" Fahrenheit is "+ celsius+" Celsius" );

        System.out.print("Enter a degree in Fahrenheit:");
        int f = sc.nextInt();
        float c = (f-32)*(float)5/9;
        System.out.println(f+" Fahrenheit is "+ c+" Celsius" );


        
        sc.close();




    }
    
}
