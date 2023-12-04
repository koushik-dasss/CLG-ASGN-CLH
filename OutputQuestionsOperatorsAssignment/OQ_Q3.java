package OutputQuestionsOperatorsAssignment;

public class OQ_Q3 {
    public static void main(String[] args) {
        int a=2,b=5,c;
        a=a*a++ - --a; // a = 2 * 2 - 2 = 4 - 2 = 2
        c=b++ - b--; // c = 5 - 6 = -1 
        System.out.println("a="+a+",b="+b+",c="+c); // a = 2 , b = 5 , c = -1 
        System.out.println(a++ + ++a * a--); // 2 + 4 * 4 = 2 + 16 = 18
        System.out.println(b=b++ * b--); // b = 5 * 6 = 30
        System.out.println("a="+a+",b="+b+",c="+c); // a = 3 , b = 5 , c = -1
    }
    
}
