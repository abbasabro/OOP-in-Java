package Interface;
interface Calculator{
	public int add(int a,int b);
	public int sub(int a,int b);
	public int multiply(int a,int b);
	public int divide(int a,int b);
}
interface TempConverter{
	public double CelsiustoFarhenheit(double c);
	public double FarhenheittoCelsius(double f);
	
}
class AbbasCalculator implements Calculator,TempConverter{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}

	public int multiply(int a,int b) {
		return a*b;
	}

	public int divide(int a,int b) {
		return a/b;
	}

	public double CelsiustoFarhenheit(double c) {
			return ((9*c)/5)+32;
	}

	public double FarhenheittoCelsius(double f) {
		
		return (f-32)*5/9;
	}

}

	

public class CalculatorMain {
	public static void main(String[] args) {
		AbbasCalculator c= new AbbasCalculator();
		System.out.println((c.CelsiustoFarhenheit(4)));
		System.out.println((c.FarhenheittoCelsius(4)));
		System.out.println((c.add(4,5)));
		System.out.println((c.sub(5,6)));
		System.out.println((c.multiply(3,6)));
		
	}

}