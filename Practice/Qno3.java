package Paper;


class Random extends Thread {
	int Upper_limit;
	// int limit=0;
	int[] storage = new int[1000];

	public Random(int u) {
		Upper_limit = u;
	}

	public void run() {
		try {
			for (int i = 1; i < 1000; i++) {
				// storage[i]=(int)Math.random()*(Upper_limit);
				storage[i] = (int) (Math.random() * ( Upper_limit-i ));

			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void print() {
		for (int n : storage) {
			System.out.println(n);
		}
	}
}

public class Qno3 {

	public static void main(String[] args) throws Exception{
		Random r1 = new Random(3000);
		Random r2 = new Random(5000);
		Random r3 = new Random(10000);

		r1.start();
		r2.start();
		r3.start();

		r3.print();

	}

}
