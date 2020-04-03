
public class DemoMyThreadJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			new MyThreadJoin("First").join();
			new MyThreadJoin("Second").join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

}
