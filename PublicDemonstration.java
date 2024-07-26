package Lab07;

class A {
	protected int age = 4;
	public void display() {
		System.out.println("Age=" + age);
	}
}

public class PublicDemonstration{
	public static void main(String[] args) {
		A obj = new A(); 
		System.out.println(obj.age);//accessed Everywhere
	}
}