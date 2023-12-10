import java.util.Scanner;
public class A4Q2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt() , r , sum = 0, number = num ;
        while (num!=0){
            r = num% 10;
            sum+=r;
            num/=10;


        }if (sum%9==0){
            System.out.println("The number " + number + " is divisible by 9 ");

        } else {
            System.out.println(  "The number "+number + " is not divisible by 9 ");
        }
        sc.close();
    }
}
    

