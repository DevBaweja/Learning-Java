package Inheritance;

public class DemoShape1 {

	public static void main(String[] args) {
		
		Shape1 sh[] = new Shape1[3];
		sh[0] = new Rectangle1(1.2f, 3.2f);
		sh[0].area();
		sh[1] = new Circle1(3.1f);
		sh[1].area();
		sh[1].display();
	}
}
