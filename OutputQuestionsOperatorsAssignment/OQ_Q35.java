package OutputQuestionsOperatorsAssignment;

public class OQ_Q35 {
    public static void main(String[] args) {
        /*int a = 10;

        if(++a==11 || ++a==12)  // if statement braces are missing as there as multiple statements under if here
        ++a;
        System.out.println(a);*/    // outside of if statement 


        // corrected code :-
        int a = 10;
        if (++a==11 || ++a== 12){ // ++a = 10 == 11 == false || ++a = 11 == 12 == false = false || false = false 
            ++a; // will not be executed , but if executed answer would have been 10 when printed (a = 11)
        }
        System.out.println(a); // 12 
    }
    
}
