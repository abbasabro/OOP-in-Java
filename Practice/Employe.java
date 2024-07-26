class Employe {
	int emp_id;
	String emp_name;
	String emp_adress;
	Employe(){
		emp_id=000;
		emp_name="abc";
		emp_adress="xyz";
		
	}
	Employe(int id,String n, String a){
		emp_id=id;
		emp_name=n;
		emp_adress=a;
			
	}
	void Display() {
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee Name: "+emp_name);
		System.out.println("Employee Address: "+emp_adress );
	}
	Employe Dummy(Employe e) {
		Employe dummy= new Employe();
		dummy.emp_id=e.emp_id;
		dummy.emp_name=e.emp_name;
		dummy.emp_adress=e.emp_adress;
		return dummy;
	}

	public static void main(String[] args) {
		Employe e1= new Employe(11,"Abbas","Jamshoro");
		e1.Display();
		Employe d1= new Employe();
		d1=e1.Dummy(e1);
		d1.Display();
		


	}

}
