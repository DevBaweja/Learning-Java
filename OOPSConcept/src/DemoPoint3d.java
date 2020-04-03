
public class DemoPoint3d {

	public static void main(String[] args) {

		Point3d P = new Point3d(); // default constructor
		P.readPoint();
		P.showPoint();
		
		Point3d Q = new Point3d(); // default constructor
		Q.readPoint();
		Q.showPoint();
		
		System.out.println("Distance between them is :"+Point3d.distance(P, Q));
		
	}

}
