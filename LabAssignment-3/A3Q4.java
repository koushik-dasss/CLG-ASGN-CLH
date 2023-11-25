import java.util.Scanner;
public class A3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user number (1-9, both  inclusive)");
        int UserValue = sc.nextInt();
        System.out.println("Computer guesses(1-9, both inclusive)");
        int ComputerValue = sc.nextInt();
        if ( ComputerValue == UserValue ){
            System.out.println("You got it right ");
        } else if (ComputerValue == UserValue + 1 ) {
            System.out.println("Almost got it ");
        } else if (ComputerValue == UserValue -1 ) {
            System.out.println("Almost got it ");
        } else {
            System.out.println("You got it wrong ");
        }
        sc.close();
        
    }
    
}
