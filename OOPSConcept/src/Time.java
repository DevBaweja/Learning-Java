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
	
	void addTime(Time P,Time Q)
	{
		this.hh = P.hh+Q.hh;
		this.mm = P.mm+Q.mm;
		this.ss = P.ss+Q.ss;
		
		this.mm += this.ss/60;
		this.ss %= 60;
		this.hh += this.mm/60;
		this.mm %= 60;
	
		/*	if(this.mm>=60)
		{
			this.mm -= 60;
			this.hh += 1;
		}
		if(this.ss>=60)
		{
			this.ss -= 60;
			this.mm += 1;
		}
		*/
	}
	
	void diffTime(Time P,Time Q)
	{
		
			// for P
		int sec1 = P.hh*3600 + P.mm*60 + P.ss;
		int sec2 = Q.hh*3600 + Q.mm*60 + Q.ss;
			// for Q
		int sec = (int) Math.abs(sec1-sec2);
		this.hh = sec/3600;
		this.mm = sec/60;
		this.ss = sec;
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
