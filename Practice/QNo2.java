
package Paper;
interface Resturant{
	void showMenu();
	String deliver();
	String serve();
	double generateBill() ;
	void cookFood(String dish);
}
class Fastfood implements Resturant{
String resName;
String resLocation;
String []foodItems;
double price[];
@Override
public void showMenu() {
	for(String n:foodItems) {
		System.out.println(n);
	}
}
@Override
public String deliver() {
	
	return "Order is Derliverd";
}
@Override
public String serve() {
	
	return "Item served";
}
@Override
public double generateBill() {
	
	return 0;
	
}
@Override
public void cookFood(String dish) {
	System.out.println("Food cooked");	
}

}
class Desi implements Resturant{
	String resName;
	String resLocation;
	String []foodItems;
	double price[];
	@Override
	public void showMenu() {
		for(String n:foodItems) {
			System.out.println(n);
		}
	}
	@Override
	public String deliver() {
		
		return "Order is Derliverd";
	}
	@Override
	public String serve() {
		
		return "Item served";
	}
	@Override
	public double generateBill() {
		
		return 0;
		
	}
	@Override
	public void cookFood(String dish) {
		System.out.println("Food cooked");	
	}
	
}
public class QNo2 {

}
