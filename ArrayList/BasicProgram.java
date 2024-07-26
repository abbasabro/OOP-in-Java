package ArrayList;
import java.util.ArrayList;
public class BasicProgram {

	public static void main(String[] args) {
     ArrayList<String> list= new ArrayList<>();
     list.add("Abbas");
     list.add("Ali");
     list.add("Aryan");
     list.add("Sarmad");
     list.add("GM");
     list.add("Aashir");
     System.out.println(list.get(4));//list.get(index):Accessing Element
     list.set(4,"G.Hussain");        //list.set(index,changing Value):Updating Element
     System.out.println(list.get(4));
     list.remove(4);                 //list.remove(index):Remove any value
     System.out.println(list.get(4));
     boolean check_element=list.contains("G.Hussain");  //list.contain(value):checks element is Present
     if(check_element)
    	 System.out.println("Element contained");
     else
    	 
    	 System.out.println("Not Contained");
     
     int size = list.size();         //list.size()    :tells size of Arraylist
     
     System.out.println("Size  "+size);
     
     for(String n: list) {
    	 System.out.println(n);
     }
     
     
     

	}

}
