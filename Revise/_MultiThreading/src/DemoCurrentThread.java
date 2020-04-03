
public class DemoCurrentThread {

	public static void main(String[] args) {


		Thread Th = Thread.currentThread();
		
		System.out.println(Th.getName());
		System.out.println(Th.getPriority());
		
		int pr = Th.getPriority();
		switch(pr)
		{
		case Thread.MIN_PRIORITY : System.out.println("Min Priority"); break;
		case Thread.NORM_PRIORITY : System.out.println("Norm Priority"); break;
		case Thread.MAX_PRIORITY : System.out.println("Max Priority"); break;
		}
		
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		Thread Th1 = new Thread();
		Th1.setPriority(Thread.MAX_PRIORITY);
		
		int p = Th.getPriority();
		switch(p)
		{
		case Thread.MIN_PRIORITY : System.out.println("Min Priority"); break;
		case Thread.NORM_PRIORITY : System.out.println("Norm Priority"); break;
		case Thread.MAX_PRIORITY : System.out.println("Max Priority"); break;
		}
		
	}

}
