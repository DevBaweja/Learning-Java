
public class DemoMyThreadSleep {

	public static void main(String[] args) {

		MyThreadSleep Th1 = new MyThreadSleep("first");  // derived ref and derived obj
		MyThreadSleep Th2 = new MyThreadSleep("second");  // base ref anf derived obj
		
		
		Th1.start();
		
//		try {
//			Th1.sleep(6000); // it is static method
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Th2.start();
		System.out.println("hi");
	}
 
}
