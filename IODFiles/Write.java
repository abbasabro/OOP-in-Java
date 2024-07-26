package IODFiles;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Write {
	

	public static void main(String[] args) {
		File file= new File("Practice.txt");
		try {
			file.createNewFile();
		}catch(Exception e) {
			e.getMessage();
		}
		try {
			FileOutputStream ois= new FileOutputStream(file);
			ObjectOutputStream oos= new ObjectOutputStream(ois);
			Student s1= new Student(5,"sarmad","Kandhkot");
			//String s="The is Abbas Here, you are Fool\n I am Sarmad";
			oos.writeObject(s1);
			ois.close();
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
