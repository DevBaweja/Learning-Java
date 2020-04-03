
public class DemoTime{
	// in main we dont need to extends anything we can directly make its objects
	public static void main(String[] args)
	{
	Time T1 = new Time();
	T1.readTime();
	Time T2 = new Time();
	T2.readTime();
	
	Time T3 = new Time();
	
	T3 = Time.addTime(T1, T2); // calling by class itself
	
	T3.showTime();
	
	Time T4 = new Time();
	
	T4 = Time.diffTime(T1, T2);
	
	T4.showTime();
	
	// T4.  all the non static methods will apppear
	//  which are called by objects itself
	
	//  Time. all the static methods will appear
	// which are called by class itself
	}

}
