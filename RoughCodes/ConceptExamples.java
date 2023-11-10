package RoughCodes;

import java.util.Scanner;
public class ConceptExamples {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*float maxFloat = Float.MAX_VALUE;
        float overflowedResult1 = maxFloat * 2; // Results in positive infinity
        System.out.println(overflowedResult1);

        float minFloat = Float.MIN_VALUE;
        float overflowedResult2 = minFloat * 2 ;
        System.out.println(overflowedResult2);  // Results in a big float value */
        

        System.out.println("Enter a float value:"); // Checking whether the value that user inputed , is a float or not
        boolean b = sc.hasNextFloat();
        System.out.println(b);

        sc.close();


    }
    
}
