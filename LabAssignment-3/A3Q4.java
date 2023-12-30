import java.util.Scanner;
public class A3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        sc.close();




    }

}
