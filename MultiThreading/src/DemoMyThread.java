
public class DemoMyThread {

	public static void main(String[] args) {

		MyThread Th1 = new MyThread();  // derived ref and derived obj
		Thread Th2 = new MyThread();  // base ref anf derived obj
		// just to make it that we can do it like this
		
	
		Th1.start(); // in start() Thread method run() will be called internally
		Th2.start();
	}

}
