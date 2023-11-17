package OutputQuestionsAssignment;

public class OQ_Q5 {
    public static void main(String[] args) {
        System.out.println(2+3+"bc"+'c'+'a'); // 5bcca
        // 2 + 3 + "bc" = 5bc ( arithmetic integer addition + string and integer concatenation )
        // 5bc + 'c' + 'a' = 5bcca ( string + char = string )

        // string + string = string 
        // string + char = char
        // char + char = integer (char can't concatenate among themselves , so their ASCII values get arithmetically added)
        
        
        System.out.println('c'+'a'+2+3+"bc");  // 99 + 97 + 2 + 3 +"bc" = 201bc
        
        // 'c' = 99 , 'a' = 97 (characters can concatenate , so they will get arithmetically added by their ASCII values)
        // 99 + 97 + 2 + 3 = 201 (integer addition)
        // 201 + "bc" = 201bc (string + integer = string)

        System.out.println("bc"+'c'+'a'+2+3); // bcca + 2 + 3 = bcca23
        
        // "bc" + 'c' + 'a' = bcca ( string + character = string)
        // "bcca" + 2 + 3 = bcca23 ( string + integer = string 
        
        
        System.out.println("bc"+('c'+'a')+(2)+3); // bc19623
        
        // "bc" + ('c' + 'a') = "bc" + (99 + 97) = "bc" + (196) = bc196 
        // bc196 + (2) + 3 = bc19623

        // string + ( char + char = integer (ASCII value addition)) + ( integer) + integer
        // string + integer + (integer) + integer = string
        
    
    }
    
}
