public class 1_23_456_sum_rows_columns{
    public static void main(String[] args){
        int num = 1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();

        }

        sc.close();


    }
}