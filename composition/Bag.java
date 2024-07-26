package composition;
import java.util.Scanner;
public class Bag {
	void display(char ch) {
		Zipper z= new Zipper();
		if(ch=='Y' ||ch=='y') {
		z.zip();
		}else if(ch=='N'||ch=='n'){
		z.unzip();
		}
	}
	class Zipper{
		void zip() {
			System.out.println("Zipped");
		}
		void unzip() {
			System.out.println("Unzipped");
		}
	}

}
class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bag b1=new Bag();
		System.out.print("Enter Y to Zip and N to Unzip : ");
		char c= s.next().charAt(0);
		b1.display(c);
		s.close();
	}
}
