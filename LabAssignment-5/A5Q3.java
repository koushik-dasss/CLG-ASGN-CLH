import java.util.Scanner;
public class A5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Prime numbers between "+ num1 + " and "+ num2 + " are : ");
        for(int i = num1 ; i<= num2 ; i++){
            int n = i  , j = 2 ;
            boolean b = true;
            while(j<=(int)Math.sqrt(n)){
                if (n%j==0){
                    b = false;
                    break;
                    
                }
                j++;
            }if(b){
                System.out.print(n+ " ");
            }

        }
        sc.close();
    }
    
}
