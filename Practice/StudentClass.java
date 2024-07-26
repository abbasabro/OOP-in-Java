
public class StudentClass {
    void display(int sec,String...names) {
    	System.out.println("Students of Section "+ sec);
    	for(String n: names) {
    		System.out.println(n);
    	}
    	
    }
	public static void main(String[] args) {
	StudentClass s1= new StudentClass();
	s1.display(1, "Abbas","Ali","GM","Sarmad");
	s1.display(2, "G.Husssain","Mehdi","Zain");
	s1.display(3, "Raza","Tahir","Meer","Ahmed","Achar");

	}

}
