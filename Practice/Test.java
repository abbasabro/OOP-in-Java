package Paper;

interface Z{
    void eat();
    void hello();
}
abstract class A{
    abstract void walk();
    void run(){
        System.err.println("Running");
    }
}
class B extends A {
    void walk(){
        System.out.println("Walking");
    }
    public void eat(){}
    public void hello(){}
    // public void eat(){
    //     System.out.println("Eating");
    // }
}
class C implements Z{
 public void eat(){
    System.out.println("Eating");
 }

@Override
public void hello() {
	// TODO Auto-generated method stub
	
}
}

public class Test {
    
}
