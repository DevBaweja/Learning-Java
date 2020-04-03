
public class MyThreadSleep extends Thread{

	public MyThreadSleep(String name) // making parametric constructor
	{
		super(name);
		super.setName(name);
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
			
				try {
					super.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		// return name of the thread
	}
	
}
