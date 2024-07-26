package IODFiles;
import java.io.FileInputStream;
public class Read {
	public static void main(String[] args) {
	  String filePath="D:\\OOP class\\ClassWork\\src\\IODFiles\\Practice.txt";
	   try {
		FileInputStream fis= new FileInputStream(filePath);
		int data;
		while((data=fis.read())!=-1) {
		System.out.print((char)data);
		}
		fis.close();
	  }catch(Exception e) {
		  e.getMessage();
	  }
	}

}
