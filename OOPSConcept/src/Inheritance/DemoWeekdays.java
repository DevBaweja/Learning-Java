package Inheritance;

class DemoWeekdays implements Weekdays {
	
	void check(int day)
	{
		if(day>=Weekdays.monday && day<=Weekdays.sunday)
			System.out.println("valid");
		else
			System.out.println("not valid");
	}
	
	// it will also contain main
	
	// otherwise we have to declare its prototype in its interface class 
	// so as to use this function in new class with main by creating interface class ref with this class object 

}
