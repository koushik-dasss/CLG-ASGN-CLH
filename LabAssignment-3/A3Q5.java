import java.util.Scanner;
public class A3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            boolean b = true ;
            System.out.println(year + " is a leap year : " + b);

        } else {
            boolean b = false ;
            System.out.println(year + " is a leap year : " + b );
        }
        
        
        
        
        sc.close();
        
    }
    
}
