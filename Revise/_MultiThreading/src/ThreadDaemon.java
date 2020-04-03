
public class ThreadDaemon extends Thread{

	
	public ThreadDaemon(String name)
	{
		super(name);
		super.setDaemon(true); // it will make daemon thread
		
		super.start();
	}
	public void run()
	{
		for(int i=1; ;i++)
			System.out.println(super.getName()+"\t"+i);
	}
}
