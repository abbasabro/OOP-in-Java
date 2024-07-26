package inheritance;
class Being{
	int numberOfLegs;
	
     void wayOfWalking() {
    	 System.out.println("Generic");
     }	
}
class Animal extends Being{
	int numberOfLegs;
	void setLegs(int n) {
		numberOfLegs=n;
	}
	void wayOfWalking() {
	 super.wayOfWalking();	
   	 System.out.println("On "+numberOfLegs+" legs");
    }
	
}
class Human extends Being{
	int numberOfLegs;
	Human(){
		numberOfLegs=2;
	}
	void wayOfWalking() {
	// super.wayOfWalking();	
   	 System.out.println("Straight");
    }
}
class Man extends Human{
	//int numberOfLegs;
	
	void wayOfWalking() {
	 super.wayOfWalking();	
   	 System.out.println("Bold");
    }
}
class Woman extends Human{
	void wayOfWalking() {
		 super.wayOfWalking();	
	   	 System.out.println("Ajeeb");
	    }
}

public class InheriDemo {
    public static void main(String[] args) {
	  Man m1= new Man();
	  m1.wayOfWalking();
	  Woman w1= new Woman();
	  w1.wayOfWalking();
    }
}
