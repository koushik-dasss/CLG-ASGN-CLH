import java.util.Scanner;
public class A2Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic_salary = sc.nextDouble(), DA = (40.0/100)*basic_salary , HRA = (20.0/100)*basic_salary,gross_salary = basic_salary+DA+HRA;
        System.out.println("DA is "+ DA);
        System.out.println("HRA is "+ HRA);
        System.out.println("Gross salary is "+gross_salary );

        sc.close();

    }
    
}
