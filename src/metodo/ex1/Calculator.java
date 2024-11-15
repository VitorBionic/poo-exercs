package metodo.ex1;

public class Calculator {
	
	public static double sum(double ...nums) {
		double sum = 0;
		
		for (double value : nums)
			sum += value;
		
		return sum;
	}
	
	public static double sub(double x, double y) {
		return x - y;
	}
	
	public static double multi(double ...nums) {
		double multi = 1;
		
		for (double value : nums)
			multi *=  value;
		
		return multi;
	}
	
	public static double div(double x, double y) {
		if (y  == 0)
			throw new IllegalArgumentException("Division by 0 is a mathematical indeterminacy");
		return x / y;
	}
}
