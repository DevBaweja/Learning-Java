
public class ThreadFunction extends Thread
{

		ThreadFunction(String name)
		{
			super(name);
			start();
		}
		
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(super.getName()+"\t"+i);
				try {
					Thread.sleep(500);  // it is static method
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				if(i==8)
				{
					System.out.println("end of Thread");
					super.stop();
				}
			}
		}
}
