// Using the formula => total number  of rows - i + 1 , where i is the each iteration of total number of rows 

public class 12345_1234_123_12_1_For1 {
    public static void main(String[] args){
        for (int i =1 ; i<=5 , i++){
            for (int j = 1 ; j<=(5-i+1) ; j++){
                System.out.print(j + " ");
            }
        } System.out.println();

    }
    
}
