import java.util.Scanner;

public class SumFunction {
	
	static int sum (int a,int b) 
	{
		return (a+b);
	}

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter two numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("sum is : " + sum(a,b) );
			

	}

}
