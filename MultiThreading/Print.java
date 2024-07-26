package MultiThreading1;

import java.util.Scanner;

public class Print extends Thread{
	private int a;
	void getData(int a) {
		this.a=a;
		this.start();
	}
      public void run() {
    	  try {
    		  for(int i=1;i<=10;i++) {
    			System.out.println(a+"x"+i+"="+(i*a));
    		    Thread.sleep(1000);
    		    }
    		  }catch (Exception e) {
    			  
    	  }
    }

	public static void main(String[] args) {
		Print p1=new Print();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:" );
		int n=sc.nextInt();
		p1.getData(n);
		sc.close();
//		p1.start();
	}
	
}
