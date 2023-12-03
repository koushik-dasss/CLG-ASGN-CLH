// Experimental Code ( Not based on exact A1Q4.java)
public class A1Q4 {

	public static void main(String[] args) {
		System.out.println("Koushik\nDas"); // Koushik
		                                    // Das
		System.out.println("Koushik");      // Koushik
		System.out.println("Das");          // Das
		String S1 = "Koushik\nDas";         
		System.out.println(S1);             // Koushik
		                                    // Das
		String S2 = "Koushik";
		String S3 = "Das";
		String S4 = S2 + S3; // "Koushik\nDas" (\n is considered here as a string)
		System.out.println(S1.equals(S4)); // false 
		System.out.println(S4); // "Koushik\nDas" 
		
		String S5 = "\n";
		String S6 = S2 + S5 + S3; 
		System.out.println(S6); // Koushik\nDas
		System.out.println(S6.equals(S1)); //true 
		
		
		/*  New line character ( escaping sequence) \n  (forward slash n)
		  shows the output  in a new line being in a same line of code 
		  It just takes the code into the next line immediately after it's use, 
		  basically formation of a new line of code.
		  
		  */
	}

}
