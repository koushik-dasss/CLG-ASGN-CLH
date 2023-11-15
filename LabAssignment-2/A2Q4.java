import java.util.Scanner;
public class A2Q4 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 0-1000:");
        int num = sc.nextInt(), a = num%10 , b = num/10  , c = b/10 , d = b%10; 
        System.out.println("The sum of digits is: "+ (a + c + d) );



        
        
        
        
        
        
        
        
        
        
        
        sc.close();

        
    }
    
}
