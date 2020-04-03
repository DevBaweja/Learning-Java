
public class DemoPoint2d {

	public static void main(String[] args) {
		
		Point2d P1 = new Point2d();
		System.out.println("point 1");
		P1.readPoint();
		P1.showPoint();
		
		Point2d P2 = new Point2d();
		System.out.println("point 2");
		P2.readPoint();
		P2.showPoint();
		
		System.out.println("distance between is ");
		System.out.println(Point2d.distance(P1,P2));
		// is Call by Class
		// here we dont want to change any object element so we are calling it by static method 
		
	}

}
