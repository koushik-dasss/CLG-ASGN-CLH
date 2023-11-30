import java.util.Scanner;
public class A2Q4 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter an integer between 0-1000:");
        int num = sc.nextInt();
        int  a = num%10 , b = num/10  , c = b/10 , d = b%10; 
        System.out.println("The sum of digits is: "+ (a + c + d) );*/


        System.out.print("Enter an integer between 0-1000: ");
        int num = sc.nextInt() , sum = 0 , r ;
        r = num%10;
        sum+=r;
        num/=10;
        r = num%10;
        sum+=r;
        num/=10;
        sum+=num;
        System.out.println("The sum of digits is: "+ sum );




        
        
        
        
        
        
        
        
        
        
        
        sc.close();

        
    }
    
}
