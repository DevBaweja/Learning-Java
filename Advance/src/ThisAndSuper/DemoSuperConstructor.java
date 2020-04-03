package ThisAndSuper;

public class DemoSuperConstructor {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.f2();
	}
}

// in inheritance , when derived class call an instance method of derived class only
// then method consists of implicit reference variables this and super both referring to current object

// Only difference in this and super
// this reference variable is of derived class type
// super refernce variable is of base class type 


class SuperClass
{
	int x;
	void f1() {
		// TODO Auto-generated method stub
	
	}
}

class SubClass extends SuperClass
{
	int x;
	void f1() {
		// TODO Auto-generated method stub	
		super.f1();
	}
	
	void f2()
	{
		int x;
		x = 1;
		this.x = 2;
		super.x = 3;
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
