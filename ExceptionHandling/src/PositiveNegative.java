import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		
		int num = sc.nextInt();
		try {
			if(num<0)
				throw new MyException("no neg,only positive");
			if(num == 0)
				throw new MyException("number must be > 0");
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}
	}

}
