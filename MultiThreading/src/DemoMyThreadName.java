
public class DemoMyThreadName {

	public static void main(String[] args) {

		MyThreadName Th1 = new MyThreadName("first"); 
		MyThreadName Th2 = new MyThreadName("second");  
		
		Th1.start();
		Th2.start();
	}

}
