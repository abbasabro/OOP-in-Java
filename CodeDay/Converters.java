package CodeDay;
import java.util.Scanner;
public class Converters {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Minutes: ");
		int min=sc.nextInt();
		float hours=0.0f;
		int sec=0;
		hours=(float)min/60;
	    sec=min*60;
		System.out.println(min+" minutes = "+hours+" hours and in seconds "+sec+" Seconds.");
        sc.close();
	}

}
