import java.util.Scanner;
public class A3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a>b && b>c){
            System.out.println("Decreasing");

        } else if (a<b && b<c){
            System.out.println("Increasing");

        } else {
            System.out.println("Neither Increasing nor Decreasing");
        }
        sc.close();
        }
        
        
    
        
    }
    

