import java.util.Scanner;

public class TertiaryConditionFunction {
	static int max(int a,int b)
	{
	int c =	(a>b) ? a :  b;
	// tertiary condition return value that depend upon conditon
	return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("maximum is "+max(a,b));
	}

}
