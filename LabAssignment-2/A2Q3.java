import java.util.Scanner;
public class A2Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic_salary = sc.nextDouble(); 
        double DA = (40.0/100)*basic_salary ; // (float)(40)/100 == (40.0/100) == (40/100.0) == (40.0/100.0)
        double HRA = (20.0/100)*basic_salary; // (float)(20)/100 == (20.0/100) == (20/100.0) == (20.0/100.0)
        double gross_salary = basic_salary+DA+HRA;
        System.out.println("DA is "+ DA);
        System.out.println("HRA is "+ HRA);
        System.out.println("Gross salary is "+gross_salary );

        sc.close();

    }
    
}
