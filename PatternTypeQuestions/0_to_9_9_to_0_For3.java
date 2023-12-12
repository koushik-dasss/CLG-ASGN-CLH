package PatternTypeQuestions;

public class 0_to_9_9_to_0_For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 , j = 9  ; i<=9   ;  i++ , j--){   // Taking extra one variable and keeping one condition
            // Non optimized code  with partial optimizations on the basis of condition

            // If the first condition is false while using Logical AND (&&) then the result is false , second condition is not checked
            // After that if also we put condition on i , for 9 iterations , automatically j-- will lead itself to 9 iterations
            // So , no need of j>=0 , j-- , if i<=9 is being done side by side 
            
            System.out.println(i+"\t"+j);
    
    
}
    }
}