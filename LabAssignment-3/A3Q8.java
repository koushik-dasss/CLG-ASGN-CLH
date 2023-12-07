import java.util.Scanner;
public class A3Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-y co-ordinates of a point :  ");
        double x = sc.nextDouble() , y = sc.nextDouble();
        

        if ( x>0 &&  y>0) {
            System.out.println( " ( " +  x  + "," + y + ")" + " is in quadrant I  ");


        } else if ( x>0 && y<0){
            System.out.println( " ( " +  x  + "," + y + ")" + " is in quadrant IV  ");


        } else if ( x<0 && y>0){
            System.out.println( " ( " +  x  + "," + y + ")" + " is in quadrant II ");


        } else if ( x<0 && y<0){
            System.out.println( " ( " +  x  + "," + y + ")" + " is in quadrant III  ");

        } else if (x==0 && y==0){
            System.out.println( " ( " +  x  + "," + y + ")" + " is on the origin   ");

        } else if ( x == 0 ){
            System.out.println( " ( " +  x  + "," + y + ")" + " is on the y-axis ");
        } else if ( y == 0 ){
            System.out.println( " ( " +  x  + "," + y + ")" + " is on the x-axis ");
        }    
        sc.close();
    }
    
}
