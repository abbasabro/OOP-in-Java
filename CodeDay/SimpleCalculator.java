package CodeDay;
import java.util.Scanner;
public class SimpleCalculator {
    public int add(int a, int b) {
    	return a+b;
    }
    public int subtract(int a, int b) {
    	return a-b;
    }
    public int multiply(int a, int b) {
    	return a*b;
    }
    public float divide(int a, int b) {
    	return (float)(a)/b;
    }
    public float remainder(int a, int b) {
    	return a%b;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		SimpleCalculator s= new SimpleCalculator();
		System.out.print("Enter 1st number: ");
		int n1=sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int n2= sc.nextInt();
		System.out.println("Addition= "+s.add(n1,n2));
		System.out.println("Subtraction= "+s.subtract(n1,n2));
		System.out.println("Multiplication= "+s.multiply(n1,n2));
		System.out.println("Division= "+s.divide(n1,n2));
		System.out.println("Remainder= "+s.remainder(n1,n2));
        sc.close();
	}

}
