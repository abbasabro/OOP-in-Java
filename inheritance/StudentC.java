package inheritance;


public class StudentC {
	String S_name;
	String F_name;
	String address;
	StudentC s;
	StudentC(){
		
	}
	StudentC(String n,String fn,String add) {
		S_name=n;
		F_name=fn;
		address=add;
	}
	StudentC(StudentC s){
		this.s=s;
		
	}
}
class SchoolStudentC extends StudentC{
	int classNumber;
	String schoolName;
	SchoolStudentC s;
	
	SchoolStudentC(int num,String n) {
		classNumber=num;
		schoolName=n;
	}
	SchoolStudentC(int num,String s_n,String n,String fn,String add) {
		super(n,fn,add);
		classNumber=num;
		schoolName=s_n;
		
	}
	SchoolStudentC(SchoolStudentC s){
		this.s=s;
	}
	void display() {
		System.out.println(classNumber);
		System.out.println(schoolName);
		System.out.println(S_name);
		System.out.println(F_name);
		System.out.println(address);
	}
}
class Main {
	public static void main(String args[]) {
		//StudentC s1= new StudentC("Abbas","Ali","ABC");
		SchoolStudentC std1= new SchoolStudentC(3, "Academy");
		SchoolStudentC std2= new SchoolStudentC(std1);
		std2.display();
		
				
	}
}