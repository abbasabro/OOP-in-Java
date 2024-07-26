package IODFiles;
import java.io.*;

public class IOWrite {

	public static void main(String[] args) {
		String filePath="D:\\OOP class\\ClassWork\\src\\IODFiles\\WriteFile.txt";
		try{
//			FileWriter fileWriter = new FileWriter(filePath);
//          fileWriter.write("Hello, world!\n");
//          fileWriter.write("This is a Java program example for writing to a file.");
        
			
			FileOutputStream fileWriter = new FileOutputStream(filePath);
			String data="Hello, world!\nThis is a Java program example for writing to a file.";
			//byte byteCode[]=data.getBytes();
			fileWriter.write(data.getBytes());
			fileWriter.close();
		}catch(Exception e) {
			e.getMessage();	
		}
		try {
			FileInputStream in=new FileInputStream(filePath);
			int bytecode;
			while((bytecode = in.read())!=-1) {
				System.out.print((char)bytecode);
			}
			in.close();
		}catch(Exception e) {
			e.getMessage();
		}
	}

}