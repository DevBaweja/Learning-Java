
public class ThreadDaemon extends Thread {
	
	ThreadDaemon()
	{
		super.setDaemon(true);
		super.start();
	}

	
	public void run()
	{
		for(int i=0; ;i++)
			System.out.println(super.getName()+"\t"+i);
	}
}
