import java.util.Scanner;
public class Question2_ConvertToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N :");
        int N = sc.nextInt();
        System.out.println("Enter the value of B :");
        int B = sc.nextInt();
        sc.close();
        String res = convertToAnyBase(N , B );
        System.out.println(res);
    }

    public static String convertToAnyBase(int N, int B) {
        char[] character = new char[26];
        for (int i = 10; i <= 35; i++) {
            character[i - 10] = (char) ('A' + i - 10);
        }

        String result = "";
        while (N != 0) {
            int r = N % B;
            N = N / B;
            if (B > 10 && r > 9) {
                result = character[r - 10] + result;
            } else {
                result = r + result;
            }
        }

        return result;
        
    }
}