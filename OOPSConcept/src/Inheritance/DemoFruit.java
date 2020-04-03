package Inheritance;
public class DemoFruit {

	public static void main(String[] args) {

		Fruit F[] = new Fruit[3];
		// ref of Base class and can be used for any Derived class
		F[0] = new Mango(); // derived class object is created
		F[0].color();
		F[0].season();
		F[0].taste();
		F[1]  = new Apple();
		F[1].color();
		F[1].season();
		F[1].taste();
		F[2] =  new Banana();
		F[2].color();
		F[2].season();
		F[2].taste();

	}

}
