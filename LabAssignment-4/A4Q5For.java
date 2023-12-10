import java.util.Scanner;
public class A4Q5For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt() , sum = 0;
        for (int i = 1  ; i<=(num/2); i++){
            if (num%i == 0){
                sum+=i;
            }
        } if (sum == num){
            System.out.println(num+" is a perfect number .");
        } else{
            System.out.println(num+" is not a perfect number .");
        }


        sc.close();
    }

}

