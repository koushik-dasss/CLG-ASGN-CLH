import java.util.Scanner;
public class A5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:  ");
        int num1 = sc.nextInt() , sum1 = 1 ;
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt() , sum2 = 1 ;
        for(int i = 2 ; i<=num1/2;i++){
            if(num1%i==0){
            sum1+=i;
            }
        }for(int i = 2 ; i<=num2/2;i++){
            if(num2%i==0){
            sum2+=i;
            }
        }if(sum1==num2 && sum2==num1){
            System.out.println(num1 + " and "+ num2 + " are amicable numbers.");
        }else{
            System.out.println(num1 + " and "+ num2 + " are not  amicable numbers.");

        }
        sc.close();
    }
    
}
