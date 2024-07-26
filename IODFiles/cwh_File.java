package IODFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cwh_File {

	public static void main(String[] args) {
	   File file = new File("newfile.txt");
	  try {
		file.createNewFile();
	} catch (IOException e) {
		System.out.println("File not created");
		e.printStackTrace();
	}
	   FileWriter fileWriter;
	try {
		fileWriter = new FileWriter(file);
		fileWriter.write("The is my first FileWriter File");
		fileWriter.write("\nChecking next line");
		fileWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	 
	
	try{
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			String line =sc.nextLine();
			System.out.println(line);
			sc.close();
		}

	}catch(Exception e){
		

	}
	

	}

}
