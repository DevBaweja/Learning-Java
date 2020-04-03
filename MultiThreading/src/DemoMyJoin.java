
public class DemoMyJoin {

	public static void main(String[] args) {

		 try {
			new MyThread().join();
			new MyThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
 

	}

}
