import java.util.Scanner;
// All the functions are Default
// Friendly Access
// Non- Static method
public class Time {

	private int hh,mm,ss;
	
	void readTime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hour");
		hh = sc.nextInt();
		System.out.println("enter min");
		mm = sc.nextInt();
		System.out.println("enter sec");
		ss = sc.nextInt();
		
	}
	
	void showTime()
	{
		System.out.println(hh+":"+mm+":"+ss);
	}
	
	static Time addTime(Time P,Time Q) // called by class
	{
		Time R = new Time();// making new Time
		R.hh = P.hh+Q.hh;
		R.mm = P.mm+Q.mm;
		R.ss = P.ss+Q.ss;
		
		R.mm += R.ss/60;
		R.ss %= 60;
		R.hh += R.mm/60;
		R.mm %= 60;
		
		return R;
		
	/*	if(R.mm>=60)
		{
			R.mm -= 60;
			R.hh += 1;
		}
		if(R.ss>=60)
		{
			R.ss -= 60;
			R.mm += 1;
		}
		*/
	}
	
	static Time diffTime(Time P,Time Q)
	{
		
		Time R = new Time();
			// for P
		int sec1 = P.hh*3600 + P.mm*60 + P.ss;
		int sec2 = Q.hh*3600 + Q.mm*60 + Q.ss;
			// for Q
		int sec = (int) Math.abs(sec1-sec2);
		R.hh = sec/3600;
		R.mm = sec/60;
		R.ss = sec;
		
		return R;
	}
	
	
	Time()
	{
		hh=mm=ss=00;
	}
	
	Time(int hh,int mm,int ss)
	{
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	
	
	Time(Time T)
	{
		hh = T.hh;
		mm = T.mm;
		ss = T.ss;
	}
	
}
