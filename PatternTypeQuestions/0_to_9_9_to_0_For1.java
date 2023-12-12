/* Pattern =>    0   9
                 1   8
                 2   7
                 3   6
                 4   5
                 5   4
                 6   3
                 7   2
                 8   1
                 9   0

 */



import java.util.Scanner;
public class 0_to_9_9_to_0_For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i<=9 ;  i++){  // Taking one variable only with one condition 
            // Using the value of first variable in another arithmetic ecpression to complete the pattern 
            System.out.println(i+"\t"+(9-i));

        }

    }
}

