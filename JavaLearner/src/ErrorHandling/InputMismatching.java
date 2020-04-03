package ErrorHandling;
import java.util.Scanner;

public class InputMismatching {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// and if we inputs other datatype than int 
		// IT will cause RUNTIME ERROR in java.util.InputMisMatchException
		System.out.println(n);
	}

}
