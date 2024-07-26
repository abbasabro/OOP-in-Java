package Lab07;

class Parent {
	String name;
	Parent(String name) {
		this.name = name;
	}
	void display() {
		System.out.println("Name: " + name);
	}
}
class child extends Parent {
	int age;
	child(String name, int age) {
		super(name);
		this.age = age;
	}
	void display() {
		super.display();
		System.out.println("Age :  " + age);
	}
}
public class SuperKeywordDemonstration {
	public static void main(String[] args) {
		child obj = new child("Abbas", 18);
		obj.display();
	}
}