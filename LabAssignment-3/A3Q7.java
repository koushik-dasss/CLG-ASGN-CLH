import java.util.Scanner;
public class A3Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of units consumed  : ");
        double Unit_Range = sc.nextInt(), Bill_Amount = 0  ;
        if (Unit_Range <= 50 ){
             Bill_Amount = Unit_Range*3;
        } else if (Unit_Range >= 50 && Unit_Range <=200){
             Bill_Amount = Unit_Range*4.80;
        } else if (Unit_Range >= 200 && Unit_Range <= 400 ){
             Bill_Amount = Unit_Range*5.80;
        } else if ( Unit_Range >= 400 ){
             Bill_Amount = Unit_Range*6.80;
            
        }
        double Discount_Amount = (3.0/100)*Bill_Amount;
        sc.nextLine();
        System.out.print("Do you want to pay online(y/n): " );
        String answer = sc.nextLine();
        if (answer.equals("y")){
            System.out.println("Total amount : "+ Bill_Amount);
            System.out.println("Discount : "+ Discount_Amount);
            System.out.println("Amount payable : "+ (Bill_Amount - Discount_Amount ));

        } else if (answer.equals("n")) {
            System.out.println("Total amount : "+ Bill_Amount);
            System.out.println("Discount :" + 0.0);
            System.out.println("Amount payable : "+ Bill_Amount);
        }
        
        
        sc.close();
        
        

 

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
    
}
