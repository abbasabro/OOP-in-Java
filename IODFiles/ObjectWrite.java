package IODFiles;
import java.io.*;

public class ObjectWrite {
     
	public static void main(String[] args) {
		
//		String filePath =;
		try {
			FileOutputStream fileWriter = new FileOutputStream("D:\\OOP class\\ClassWork\\src\\IODFiles\\ObjectFile.txt");
			ObjectOutputStream obj= new ObjectOutputStream(fileWriter);
			Student s1= new Student(1,"Abbas","Khp");
			Student s2= new Student(2,"GHK","larkana");
			obj.writeObject(s1);
			obj.writeObject(s2);
			obj.close();
			
			
		}catch(Exception e) {
			e.getMessage();
		}
	}

}