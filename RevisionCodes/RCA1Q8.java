package RevisionCodes;

public class RCA1Q8 {
    public static void main(String args[]){
        int x=10,y=20;
        x=x+y; // x = 10 + 20 = 30
        y=x-y; // y = 30 - 20 = 10 
        x=x-y; // x = 30 - 10 = 20
        System.out.println("Exchanged value of x is:"+x+"\nExchanged value of y is:"+y);


    }
    
    
}
