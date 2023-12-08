import java.util.Scanner;
public class A3Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter secured marks : ");
        double  marks = sc.nextDouble();
        int index = (int) (marks/10);
        String grade = " " ;
        switch (index){

            case 10:
            case 9 : grade  = "O";
            break;
            case 8:  grade  = "A";
            break;
            case 7:  grade = "B";
            break;
            case 6:  grade = "C";
            break;
            case 5:  grade = "D";
            break;
            case 4:  grade = "E";
            break;
            
   
            default: grade = "F";
            break;
        }
           System.out.println(marks+" marks  = " + grade + " grade");
           sc.close();
    }
}
        





        
        
    
