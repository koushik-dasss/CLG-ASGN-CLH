public class HA2CLAQ3 {
    public static void main(String[] args) {
        System.out.println("Enter a four digit number : ");
		int num = Integer.parseInt(args[0]);
		int FirstDigit = num/1000 , LastDigit = (((num%1000)%100)%10);
		System.out.println("The sum of the first and last digit of the number is :   " + (FirstDigit + LastDigit));
		
    }
    
}
