/*  Pattern => 1st "msg"
               2nd "msg"
               3rd "msg"
               4th "msg"
               5th "msg"
    N st/nd/rd/th  "msg"

                 */

package PatternTypeQuestions;
import java.util.Scanner;
public class N_Times_MessageDisplay_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message : ");
        String msg = sc.next();
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();
        for (int i=1 ; i<=n ; i++ ){
            if (i%10 ==1 && i%100!=11){
                System.out.println(i+"st "+ msg);
            }else if (i%10 ==2 && i%100!=12){
                System.out.println(i+"nd "+ msg);
            }else if (i%10 ==3 && i%100!=13){
                System.out.println(i+"rd "+ msg);
            }else{
                System.out.println(i+"th "+ msg);
            }
        }









        sc.close();
    }
    
}
