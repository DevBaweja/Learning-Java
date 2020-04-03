
public class DemoMyThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable Th1 = new MyFirstRunnable("First");
				// base ref and derived object
		Runnable Th2 = new MyFirstRunnable("Second");
	}

}
