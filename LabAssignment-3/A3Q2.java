import java.util.Scanner;
public class A3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water Alice drinks in a day in ml : ");
        double w = sc.nextDouble();
        if (w >= 5000){
            System.out.println(" Yes, Alice is following doctor's advice ");
        } else {
            System.out.println("No, Alice is not following doctor's advice");
        }
        
        
        
        
        
        sc.close();
    }
    
}
