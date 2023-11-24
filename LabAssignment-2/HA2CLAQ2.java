public class HA2CLAQ2 {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]) , h = Double.parseDouble( args[1]);
		double area = Math.PI*(r)*(r) + 2*Math.PI*(r)*(h);
		System.out.println("Surface area is : "+ area);

    }
    
}
