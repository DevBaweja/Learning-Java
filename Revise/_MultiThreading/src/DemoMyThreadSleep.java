
public class DemoMyThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadSleep Th1 = new MyThreadSleep("First");
		// actually we only need constructor
		// Derived class object and Derived class Ref
		
		Thread Th2 = new MyThreadSleep("Second");
		// Derived class object and Base class Ref
	}

}
