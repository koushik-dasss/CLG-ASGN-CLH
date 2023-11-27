import java.util.Scanner;
public class HA3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int day = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today: " ); 
        int future_day = sc.nextInt();

        String day_string = " " ;
        switch (day) {
            case 0 : day_string = " Sunday ";
            break;
            case 1 : day_string = " Monday ";
            break;
            case 2 : day_string = " Tuesday ";
            break;
            case 3 : day_string = " Wednesday ";
            break;
            case 4 : day_string = " Thursday ";
            break;
            case 5 : day_string = " Friday ";
            break;
            case 6 : day_string = " Saturday ";
            break;
            
        }
            
        
        System.out.println("Today is "+ day_string + " and the future day is "+ future_day );
        sc.close();




        }
        
    }
    

