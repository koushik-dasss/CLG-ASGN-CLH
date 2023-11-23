import java.util.Scanner;
public class HA2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  total number of eggs: ");
        int eggs = sc.nextInt(), gross = eggs/144 ,dozen = (eggs % 144) / 12 , left_over = (eggs % 144) % 12;
        // Your number of eggs is 9 gross, 3 dozen, and 10.
        System.out.println("Your number of eggs is " + gross + " gross, "+ dozen + " dozen, and  " + left_over  );

















        sc.close();
        
    }
    
}
