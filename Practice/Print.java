import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=s.nextInt();
		System.out.println("Enter Limit:");
		int limit=s.nextInt();
		for(int i=1;i<=limit;i++) {
			System.out.println(num+"x"+i+"="+i*num);
		}
        s.close();

	}

}
