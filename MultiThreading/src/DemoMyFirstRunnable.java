
public class DemoMyFirstRunnable {

	public static void main(String[] args) {
		
		MyFirstRunnable Th = new MyFirstRunnable("First");
		MyFirstRunnable Th1 = new MyFirstRunnable("Second");
	}

}
// if we need threads in derived class then extends base or extends Thread as we can extends only one class
// so we use implements Runnable
// to extends base implements Runnable
