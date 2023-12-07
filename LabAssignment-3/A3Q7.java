import java.util.Scanner;
public class RoughCodes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit range : ");
        int u = sc.nextInt();
        double bill ;
        if (u<=50){
            bill = u*3.0;

        } else if (u<=200){
            bill = 50*3.0 + (u-150)*4.80;

        } else if (u<=400){
            bill = 50*3.0 + 150*4.80 + (u-200)*5.80;

        } else {
            bill = 50*3.0 + 150*4.80 + 200*5.80 + (u-400)*6.20;

        }
        System.out.println("The unit range is : "+ u);
        System.out.println("The electricity bill payment is : "+ bill );

        sc.nextLine();
        System.out.println("Want to pay online , (Y/N): ");
        char ch = sc.next().charAt(0);
        if ((ch =='Y' || ch =='y' )){
            System.out.println("You want to pay online .");
            double disc = 0.03*bill;
            System.out.println("Discount is : "+ disc);
            System.out.println("Payment is :"+ (bill - disc));
        }
        else if ((ch == 'N' || ch == 'n')){
            System.out.println("You want to play offline.");
            System.out.println("Payment is :"+ bill);



        } else {
            System.out.println("Wrong option chosen ");
        }


    }
}


