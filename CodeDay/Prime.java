package CodeDay;

import java.util.Scanner;

public class Prime {
	static boolean isPrime(int n) {
		boolean check=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				check=false;
				break;
			}else {
				check=true;
			}
		}
		return check;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number to check:");
		int n=sc.nextInt();
		boolean isPrime=isPrime(n);
		if(isPrime) {
			System.out.println(n+" is Prime");
		}else {
			System.out.println(n+" is not Prime");
		}
		sc.close();
	}

}
