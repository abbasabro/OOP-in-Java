package IODFiles;

import java.io.Serializable;

public class Student implements Serializable{
	int roll_no;
	String name;
	String district;

	Student(int roll_no, String name, String district) {
		this.roll_no = roll_no;
		this.name = name;
		this.district = district;
	}
}
