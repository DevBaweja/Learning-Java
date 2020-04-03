
public class DemoThreadFunction {

	public static void main(String[] args) {
	try {	
		Thread Th = new ThreadFunction("First"); // start
		System.out.println("Main Thread in sleepind mode for 3 sec");
		Thread.sleep(3000);
		
		
		System.out.println(Th.getName()+"in suspend mode");
		Th.suspend();
		
		System.out.println("Main Thread in sleepind mode for 3 sec");
		//Thread.sleep(3000);
		
		if(Th.isAlive())
			System.out.println("Th is Alive state");
		else
			System.out.println("Dead state");
		
		System.out.println(Th.getName()+" is in resume mode");
		
		Th.resume();

	}
	catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
