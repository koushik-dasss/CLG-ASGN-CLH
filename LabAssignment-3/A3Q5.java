import java.util.Scanner;
public class A3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if (year % 4 == 0){
            boolean b1 = true ;
            System.out.println(year + " is a leap year : " + b1 );

        } else {
            boolean b2 = false ;
            System.out.println(year + " is a leap year : " + b2 );
        }
        
        
        
        
        sc.close();
        
    }
    
}
