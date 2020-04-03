
public class DemoCurrentThread {

	public static void main(String[] args) {
			
			Thread Th = Thread.currentThread();// it is static method of thread class
			System.out.println(Th.getName());
			System.out.println(Th.getPriority());
			
			System.out.println(Thread.MIN_PRIORITY);
			System.out.println(Thread.NORM_PRIORITY);
			System.out.println(Thread.MAX_PRIORITY);
			System.out.println(Th);
			
	}

}
