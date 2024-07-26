package Inheritance1;

public class Main {
	public static void main(String[] args) {
		//Abstract Class Object not be made 
		//Quadilateral q= new Quadilateral(3, 5.3, 2.3, 4.5);
		Square s= new Square(3.4);
		Recatangle r=new Recatangle(2.3,4.3);
		//q.computeArea();
		System.out.println(s.computeArea());
		System.out.println(r.computeArea());
		
		//Method Dispatch
		System.out.println("Method Dispatch");
		Quadilateral refvar;
		refvar=s;
		System.out.println(refvar.computeArea());
		refvar=r;
		System.out.println(refvar.computeArea());
	}

}
