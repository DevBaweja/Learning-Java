
public class DemoBox {

	public static void main(String[] args) {
		Box b = new Box();
		b.setDimension(1, 1, 1);
		b.sendBox();
	}
}

class Box {

	@SuppressWarnings("unused")
	private int x, y, z;

	public static void set(int x) {
		// this.x = x; will give error as method is static and this is non-static object
		// reference
	}

	public void setDimension(int x, int y, int z) {
		// this - object reference is local variable of instance member methods
		// referring to caller object

//		this.x is instance variable
//		x is local variable
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void sendBox() {
		// TODO Auto-generated method stub
		GiftTaker gf = new GiftTaker();
		gf.acceptGift(this);
	}

}

class GiftTaker {

	public void acceptGift(Box box) {
		// TODO Auto-generated method stub
		System.out.println("Gift Accepted");
	}

}
