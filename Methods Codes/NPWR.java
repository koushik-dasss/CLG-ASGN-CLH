import java.util.Scanner;
public class NPWR {
    public static int add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a  = sc.nextInt();
        int b  = sc.nextInt();
        sc.close();
        System.out.println(a + "+" + b + "=");
        return(a+b);

    }
    public static void main(String[] args) {
        int r = add();
        System.out.println(r);
    }
    }
    

