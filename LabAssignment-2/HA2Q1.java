import java.util.Scanner;
public class HA2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        double t = sc.nextDouble(); 
        int years = (int) t/525600 , days = (int) (t%525600)/1440;
        System.out.println(t + " minutes is approximately " + years + " years and " +  days + " days."); 


















        sc.close();
        
        
    }
    
}
