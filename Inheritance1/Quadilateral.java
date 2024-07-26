package Inheritance1;

public abstract class Quadilateral {
	double s1,s2,s3,s4;
	Quadilateral(double s1,double s2,double s3,double s4){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}
	public abstract double computeArea(); //{
		//System.out.println("This method is specific for quadilateral");
		//return -99;
	//}

}
