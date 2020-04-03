public class DemoTime {

	public static void main(String[] args) {
		Time T = new Time(); // Default Constructor
		T.showTime();
		T.readTime();
		T.showTime();
		
		Time T1 = new Time(T); // Copy constructor
		System.out.println("same time");
		T1.showTime();
		
		Time T2 = new Time(6,45,30); // Parameteric constructor
		System.out.println("my given time");
		T2.showTime();
		
		Time T4 = new Time(); 
		T4.addTime(T1,T2); // Calling by object to change that particular object
							// This is non static method
		System.out.println("new sum time");
		T4.showTime();
		
		Time T6 = new Time();
		
		T6.readTime(); 
		
		Time T5 = new Time();
		T5.diffTime(T1,T6); // calling by object 
		System.out.println("new differnce time");
		T5.showTime();


	}

}
