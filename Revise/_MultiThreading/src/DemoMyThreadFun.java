
public class DemoMyThreadFun {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Start");
		
		Thread Th = new MyThreadFun("First");
		try {
			System.out.println("Main Thread is in sleep for 5 sec");
			Thread.sleep(5000);
			System.out.println("First Thread in suspend mode");
			Th.suspend();
			
			System.out.println("Main Thread is in sleep for 5 sec");
			Thread.sleep(5000);
			
			if(Th.isAlive())
				System.out.println("First is alive mode");
			else 
				System.out.println("First is in Stop");
			
			System.out.println("Resume it");
			Th.resume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
