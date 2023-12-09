import java.util.Scanner;
public class A4Q7For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. for which you want to find the multiplication table:  ");
        int num = sc.nextInt(),ctr = 1 ;
        System.out.println("The multiplication table of 8 is:");
        for ( ctr=1;ctr<=10;ctr++){
            System.out.println(num+"*"+ctr+"="+(num*ctr));
        }

    
    sc.close();
    }

}