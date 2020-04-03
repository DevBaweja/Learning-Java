import java.util.Scanner;

public class DemoString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = "Hello" ;
		
		System.out.println("Enter index");
		
		
		int i = sc.nextInt();
		System.out.println(str.charAt(i));
	}

}
