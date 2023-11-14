import java.util.Scanner;
public class A2Q4 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 0-1000:");
        int num = sc.nextInt(), sum, ctr =0;
        sum = num%10; // 9
        ctr+=sum; // 0 + 9 = 9
        sum = num/10; // 74
        sum = num%10; // 4
        System.out.println(sum);
        ctr+=sum; 
        System.out.println(ctr);




        
        
        
        
        
        
        
        
        
        
        
        sc.close();

        
    }
    
}
