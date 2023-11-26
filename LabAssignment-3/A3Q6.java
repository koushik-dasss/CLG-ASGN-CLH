import java.util.Scanner;
public class A3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit range : ");
        int Unit_Range = sc.nextInt();
        if (Unit_Range <= 50 ){
            System.out.println("The montly electricity bill is :  Rs.  "+ (Unit_Range*3));
        } else if (Unit_Range >= 50 && Unit_Range <=200){
            System.out.println("The monthly electricity bill is : Rs.  "+ (Unit_Range*4.80));
        } else if (Unit_Range >= 200 && Unit_Range <= 400 ){
            System.out.println("The monthly electricity bill is : Rs.  "+ (Unit_Range*5.80));
        } else if ( Unit_Range >= 400 ){
            System.out.println("The monthly electricity bill is : Rs.  "+ (Unit_Range*6.80));
        }
 
        
        
        
        sc.close();
        
    }
    }
