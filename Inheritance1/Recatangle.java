package Inheritance1;

public class Recatangle extends Quadilateral{
	public Recatangle(double s1,double s2) {
		super(s1,s2,s1,s2);
	}
	public double computeArea() {
		return s1*s2;
	}
	

}
