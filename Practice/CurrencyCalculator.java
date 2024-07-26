import java.util.Scanner;
public class CurrencyCalculator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value :");
		double amount=s.nextDouble();
		int fiveNote=(int)amount/5000;
		int remainder=(int)amount%5000;
		int thNote=remainder/1000;
		remainder=remainder%1000;
		int hund=remainder/100;
		
		System.out.println("Five Thousand Notes:"+fiveNote);
		System.out.println("Thousand Notes:"+thNote);
		System.out.println("Hundred Notes:"+hund);
		s.close();

	}

}
