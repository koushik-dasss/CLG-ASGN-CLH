public class HA1Q1 {
    public static void main(String[] args){
        // Priority order = left to right
        System.out.println(2+"bc"); // int + string = string (concatenation) "2bc"
        System.out.println(2+3+"bc"); // int + int + string = int + string =  string ( left to right) "5bc"
        // Arithmetic operations between two int , then concatenation between int and string 
        System.out.println((2+3)+"bc"); // () has first priority , (2+3) = 5 will be solved first , then concatenation "5bc" 
        System.out.println("bc"+(2+3)); // (2+3)=(5) = "bc"+5= "bc5" 
        System.out.println("bc"+2+3);   // left to right order, so first concatenation then again string + int concatenation
        // "bc"+ 2 = "bc2" +"3" = "bc23" 



        

    }
    
}
