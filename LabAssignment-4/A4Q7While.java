import java.util.Scanner;
public class A4Q7While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. for which you want to find the multiplication table:  ");
        int num = sc.nextInt(), ctr =1 ;
        System.out.println("The multiplication table of 8 is:");
        while (ctr<=10){
            System.out.println(num+"*"+ctr+"="+(num*ctr));
            ctr++;

        }
    

        sc.close();
    }


}

