
public class MyThreadYeild extends Thread{

	// instead of using Thread.AnyMethodOfThread we could use super.AnyMethod
	public MyThreadYeild(String name) // making parametric constructor
	{
		super(name);
		// calling of the start of thread
		// which will internally call run method
		
		super.start();
		// super.setName(name);
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
			{
			System.out.println(super.getName()+"\t"+i);
			
				super.yield();
				// Round Robin
				// Ideal output is first thread then second thread
			}
		// return name of the thread
	}
	
}
