package Paper;
abstract class Printer{
	protected String serial;
	protected String model;
	protected int price;
	protected int ppm;
	public Printer(String s,String m,int p,int ppm){
		serial=s;
		model=m;
		price=p;
		this.ppm=ppm;
		
	}
	abstract void print();
	abstract void refill();
}
class LaserPrinter extends Printer{
	public LaserPrinter(String tt,String s, String m, int p, int i) {
		super(s, m, p, i);
		tonerType=tt;
	}
	private String tonerType;
	private boolean scanner;
	private boolean duplexMode;
	void print() {
		System.out.println("Laser Print PRinting");
		
	}
	void refill() {
		System.out.println("Refilling Laser PRinter");
		
	}
}
class InkjetPrinter extends Printer{
	public InkjetPrinter(String ct,String s, String m, int p, int i) {
		super(s, m, p, i);
		catridgeType=ct;
	}
	private String catridgeType;
		void print() {
			System.out.println("Inkjet Printer PRinting");
		
	}
	void refill() {
		System.out.println("Refilling Inkjet Printer");
		
	}
}
public class QNo2b {
	public static void main(String[] args) {
	
	
	InkjetPrinter ij= new InkjetPrinter("abc", "XYZ", "2024", 50000,0);
	LaserPrinter lp= new LaserPrinter("laser", "merhran", "x-p", 100000, 0);
	Printer p;
	p=ij;
	p.refill();
	p.print();
	p=lp;
	p.refill();
	p.print();
	}
}
