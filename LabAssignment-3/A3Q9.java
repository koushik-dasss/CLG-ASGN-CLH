import java.util.Scanner;
public class A3Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a,b,c :  " );
        int a = sc.nextInt(), b = sc.nextInt() , c = sc.nextInt();
        if (a>b && a>c){
            System.out.println(a+" is the largest");
            if (b>c){
                System.out.println(b+" is the second largest");
            }else{
                System.out.println(c+" is the second largest");
            }
        } else if(b>a && b>c){
            System.out.println(b+" is the largest");
            if (a>c){
                System.out.println(a+" is the second largest");

            }else {
                System.out.println(c+" is the second largest");

            }
        } else {
            System.out.println(c+" is the largest");
            if (c>b){
                System.out.println(c+" is the second largest");
            }else{
                System.out.println(b+" is the second largest");
            }
        }
        











    sc.close();
    }
}
