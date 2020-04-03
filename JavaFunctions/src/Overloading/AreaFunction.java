package Overloading;
import java.util.Scanner;

public class AreaFunction {

	static float area (float r)
	{
		return ((float)3.14*r*r);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter raduis");
		
		float r = sc.nextFloat();
		System.out.println("area of circle: "+ area(r));

	}

}
