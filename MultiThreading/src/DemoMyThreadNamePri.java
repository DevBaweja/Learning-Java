
public class DemoMyThreadNamePri {

	public static void main(String[] args) {

		MyThreadNamePri Th1 = new MyThreadNamePri("first",Thread.MIN_PRIORITY); 
		MyThreadNamePri Th2 = new MyThreadNamePri("second",Thread.NORM_PRIORITY);  
		MyThreadNamePri Th3 = new MyThreadNamePri("third",Thread.MAX_PRIORITY);  
	
	}

}
