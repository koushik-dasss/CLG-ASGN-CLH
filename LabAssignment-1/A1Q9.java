public class A1Q9 {
    public static void main(String[] args){
        System.out.println(5); // 5 direct integer output
        System.out.println((float)25/6); // 25/6 = 4 (int. with normal division) , (float) 25/6= 4.1666665 
        // First 25 is converted to float , then divided by int. 6 = 25.0/6 = 4.1666665
        System.out.println(5+'6'); // 5+ ASCII value of 6 = 5 + 54 = 59
        System.out.println(5+7+'9'); // 12+ ASCII value of 9 = 12 + 57 = 69
        System.out.println("92"+7+5); // 92+"7"=927+"5"=9275
        System.out.println(2+"9"); //29


        // Experimental Code :- 
        System.out.println((float)25/6); // 25.0/6 = 4.1666665
        System.out.println((float)(25/6)); // (float) (4) = 4 
        System.out.println(25/(float)6); // 25/6.0 = 4.1666665
        System.out.println(25/6); // 4


        // ASCII value starting is from 48 , 0 has 48 , A has 65 , a has 97 
        // String + Int/String = String 
        // Int + Char/Byte/Short = Int




    }
    
}
