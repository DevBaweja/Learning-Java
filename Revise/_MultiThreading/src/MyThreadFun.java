
public class MyThreadFun extends Thread{

	public MyThreadFun(String name)
	{
		super(name); 
		super.start();
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(super.getName()+"\t"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i==8)
			{
				System.out.println("Kill");
				super.stop(); // will kill thread
			}
		}
	}
}
