package MultiThreading1;

/*class Even extends Thread{
	public void run() {
		try {
			for(int i=1;i<=30;i++) {
				if(i%2==0) {
					System.out.println(i);
					if(i==14) {
						Thread.sleep(5000);
					}
				}
			}
		}catch(Exception e) {
			
		}
	}
}
class Odd extends Thread{
	public void run() {
		try {
			for(int i=2;i<=30;i++) {
				if(i%2!=0) {
					System.out.println(i);
					if(i==15) {
						Thread.sleep(5000);
					}
				}
			}
		}catch(Exception e) {
			
		}
	}
}*/
class Series extends Thread{
	
	public void run() {
		//if(super.getName()=="ODD") {
		if(Thread.currentThread().getName()=="ODD") {
		try {
			for(int i=1;i<=30;i++) {
				if(i%2!=0) {
					System.out.println(i);
					if(i==15) {
						Thread.sleep(5000);
					}
				}
			}
		}catch(Exception e) {
			
		}
	  }//else if(super.getName()=="EVEN") {//Also with Thread.currentthread().getName();
		else if(Thread.currentThread().getName()=="EVEN") { 
		try {
				for(int i=1;i<=30;i++) {
					if(i%2==0) {
						System.out.println(i);
						if(i==14) {
							Thread.sleep(5000);
						}
					}
				}
			}catch(Exception e) {
				
			}
	  }
	}	
}
public class SeriesNumber {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Even e= new Even(); Odd o= new Odd(); e.start(); e.join(); o.start();
		 */
		Series s= new Series();
		s.setName("ODD");
		s.start();
		//s.setName("EVEN");
		//s.start();

	}

}
