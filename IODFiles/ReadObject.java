package IODFiles;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		String filePath="D:\\OOP class\\ClassWork\\src\\IODFiles\\ObjectFile.txt";
		try {
			FileInputStream fis= new FileInputStream(filePath);
			ObjectInputStream ois= new ObjectInputStream(fis);
			Object object= ois.readObject();
			System.out.println(object);
			ois.close();
		
		}catch(Exception e) {
			e.getMessage();
		}
 

	}

}
