package ClassworkCodes;

public class MaxValueMinValue {
    public static void main(String[] args ){

        // Ranges of value of different data types
        int a = Integer.MAX_VALUE,b = Integer.MIN_VALUE;
        System.out.println("The value of integer data type ranges from : "+ b + " to " + a );
        short c = Short.MAX_VALUE,d = Short.MIN_VALUE;
        System.out.println("The value of short data type ranges from : "+ d + " to " + c );
        byte e = Byte.MAX_VALUE,f = Byte.MIN_VALUE;
        System.out.println("The value of byte data type ranges from : "+ f + " to " + e );
        long g = Long.MAX_VALUE,h = Long.MIN_VALUE;
        System.out.println("The value of long data type ranges from : "+ h + " to " + g );
        float i = Float.MAX_VALUE,j = Float.MIN_VALUE;
        System.out.println("The value of float data type ranges from : "+ j + " to " + i );
        double k = Double.MAX_VALUE,l = Double.MIN_VALUE;
        System.out.println("The value of double data type ranges from : "+ k + " to " + l );
        

        // Operations on MAX_VALUE and MIN_VALUE
        
        // Multiplication of Integer.MAX_VALUE with even number 
         
        // Integer.MAX_VALUE*(even no.) = -(even no.)

        System.out.println(a*2); 
        System.out.println(a*4);
        System.out.println(a*6);

        // Multiplication of Integer.MAX_VALUE with odd number
        
        // Integer.MAX_VALUE*(odd no.) = Integer.MAX_VALUE - odd no. + 1

        System.out.println(a*1);
        System.out.println(a*3);
        System.out.println(a*5);
        
        
        // Multiplication of Integer.MIN_VALUE with even number
        
        // Integer.MIN_VALUE*(even no.) = 0

        System.out.println(b*2);
        System.out.println(b*4);
        System.out.println(b*6);


        // Multiplication of Integer.MIN_VALUE with odd number
        
        // Integer.MIN_VALUE*(odd no.) = Integer.MIN_VALUE

        System.out.println(b*1);
        System.out.println(b*3);
        System.out.println(b*5);
        
        
        // Multiplication of Short.MAX_VALUE with even number 

        // Normal Multiplication as no short  value underflow/overflow takes place 

        System.out.println(c*2);  
        System.out.println(c*4);
        System.out.println(c*6);

        // Multiplication of Short.MAX_VALUE with odd number
        
        
        // Normal Multiplication as no short  value underflow/overflow takes place 

        System.out.println(c*1);  
        System.out.println(c*3);
        System.out.println(c*5);

        // Multiplication of Byte.MAX_VALUE with even no. 

        System.out.println(e*2);
        System.out.println(e*4);
        System.out.println(e*6);

        // Multiplication of Byte.MAX_VALUE with odd no. 

        System.out.println(e*1);
        System.out.println(e*3);
        System.out.println(e*5);








        








    }
    
}
