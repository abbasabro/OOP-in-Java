
public class Calculate {
    int Sum(int n1,int n2) {
    	return n1+n2;
    }
    int Sum(int n1,int n2,int n3) {
    	return n1+n2+n3;
    }
    double Sum(double n1,double n2,double n3 ,double n4) {
    	return n1+n2+n3+n4;
    }
    
	public static void main(String[] args) {
		Calculate s= new Calculate();
		System.out.println("Two integers "+s.Sum(2,3));
		System.out.println("Three Integers "+s.Sum(2, 3, 4));
		System.out.println("Four Double "+ s.Sum(3.7, 4.7, 5.3, 6.2));

	}

}
