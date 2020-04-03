package Inheritance;
import java.util.Scanner;

public class DemoShape {

	public static void main(String[] args) {


//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter r");
//		float r = sc.nextFloat();
//		Shape Sref = new Circle(r);
//		// abstract base class ref with to create derived class objects
//		Sref.display();
//		Sref.area();
//		Sref.perimeter();
//		Sref.noOfSides();
//		
//		Rectangle []R = new Rectangle[3];
//		// simply array creating
//		// derived ref and can only be used for derived class objects
//		for(int i=0;i<R.length;i++)
//		{
//			System.out.println("enter l and b");
//			float l = sc.nextFloat();
//			float b  = sc.nextFloat();
//			
//			R[i] = new Rectangle(l,b);
//			R[i].area();
//			R[i].perimeter();
//			R[i].noOfSides();
//		}
		
		Shape []S = new Shape[3];
		
		// abstract base ref 
		// which can be used to create object of any derived class
		// it can be of circle , rectangle , triangle
		// here objects cannot be of shape
		S[0] = new Circle(2.5f);
//		S[0].area();
//		S[0].perimeter();
//		S[0].noOfSides();
				
		S[1] = new Rectangle(2.4f,8.3f);
//		S[1].area();
//		S[1].perimeter();
//		S[1].noOfSides();
		
		S[2] = new Triangle(5.4f,6.2f);
//		S[2].area();
//		S[2].perimeter();
//		S[2].noOfSides();
		
		for (int i = 0; i < S.length; i++) {
			S[i].display();
			S[i].area();
			S[i].perimeter();
			S[i].noOfSides();
		}
	}

}
