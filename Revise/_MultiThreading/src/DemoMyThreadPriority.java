
public class DemoMyThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread Th1 = new MyThreadPriority("First",1);
		// actually we only need constructor
		
		Thread Th2 = new MyThreadPriority("Second",5);
		
		Thread Th3 = new MyThreadPriority("Third",10);

	}

}
