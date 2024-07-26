package CodeDay;

import java.util.ArrayList;
import java.util.Scanner;

public class SeriesPrime {
	
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
    	ArrayList<Integer> listPrime=new ArrayList<>();
		System.out.print("Enter Limit : ");
		int limit=sc.nextInt();
		for(int i=2;i<=limit;i++) {
			if(i==2) {
				listPrime.add(2);
			 }
			else if(isPrime(i)) {
				listPrime.add(i);
			}
		}
		for(int n:listPrime) {
			System.out.println(n);
		    }
		System.out.println(listPrime.size()+" are in the list");
		sc.close();
     }
}	