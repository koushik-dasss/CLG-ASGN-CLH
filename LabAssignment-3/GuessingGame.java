import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rounds you want to play : ");
        int round = sc.nextInt(), ctr = 0 ;
        while (ctr<=round){
            System.out.print("Enter user number :");
        int UserValue = sc.nextInt();
        System.out.print("Computer guesses :");
        int ComputerValue = (1 + (int)((10)*Math.random()-1));
        System.out.println(ComputerValue);
        if (ComputerValue == UserValue){
            System.out.println("You got it right ");

        }else if ((ComputerValue == UserValue + 1 || ComputerValue == UserValue - 1 )){
            System.out.println("Almost got it ");
        }else {
            System.out.println("You got it wrong ");
        }
        ctr++;

        sc.close();



        }
        
    }

}



    
    

