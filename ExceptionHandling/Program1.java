package ExceptionHandling;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
	
}
public class Program1 {

	static void divide(int q,int d) throws MyException {
		if (d==0) {
			throw new MyException("Not DivideAble");
		}else {
			System.out.println(q/d);
		}
		
	} 
	public static void main(String[] args) {
		//Program1 obj= new Program1();
		try {
		    divide(5,0);
			//System.out.println(5/0);
		}catch(MyException e){
			System.out.println(e.getMessage());
		}

	}

}
