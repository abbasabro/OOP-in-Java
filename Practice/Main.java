import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Person Ayan=new Person("Ayan", 18);
		Book b1=new Book("HP1","WB");
		Book b2=new Book("HP2","WB");
		Book b3=new Book("HP3","WB");
		Ayan.addWrittenBook(b1);
		Ayan.addWrittenBook(b2);
		Ayan.addWrittenBook(b3);
		
		//Person Zain=new Person("Zain", 18);
		Iterator<Book> itr = Ayan.getWrittenBooks().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getName());
		}
		
		
	}
}
