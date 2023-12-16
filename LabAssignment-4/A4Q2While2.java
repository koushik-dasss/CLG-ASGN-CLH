import java.util.Scanner;

public class A4Q2While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0 , r ;
        System.out.print(n);
        while (n!=0){
            r=n%10;
            sum+=r;
            n/=10;

        } if (sum%9 == 0){
            System.out.println(" is divisible by 9 ");
        } else{
            System.out.println(" is not divisible by 9");
        }



        
        
        
        
        
        
        
        sc.close();
    }
    
}
