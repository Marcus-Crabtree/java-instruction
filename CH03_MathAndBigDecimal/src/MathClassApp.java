
public class MathClassApp {

	public static void main(String[] args) {
// do some rounding
		long result = Math.round(1.667);
		int result1 =(int)Math.round(1.49);
	System.out.println(result);
	System.out.println(result1);
	
// round a double to a specific # of decimal places
	double x = 10.315;
// round to 2 decimal places
	double x1 = (double)Math.round(x*100) / 100;
	System.out.println(x1);
//round to 1 decimal place
	double x2 = (double)Math.round(x*10) / 10;
	System.out.println(x2);
// random method - generate random numbers
	double r1 = Math.random();
	System.out.println(r1);
//rollin' dice
	int die1 = (int)(Math.random()*6)+1;
	System.out.println(die1);
	
// min and max
	System.out.println(Math.max(7, 11));
	System.out.println(Math.min(3678, 3442));
	
	
	
	
	}

}
