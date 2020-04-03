
public class ConstructorChaining {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B obj = new B();
	}
}

class A {

	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A");
	}
}

class B extends A {
	public B() {
		// TODO Auto-generated constructor stub
		// we cannot write super and this both
		// super is added implicit
		// here super of this constructor will not be called
		this(5);
		System.out.println("B");
	}

	public B(int i) {
		// it is called from B() and its super will call A()
		// if we dont want to call A() then we add here this()
		// but it will give recurvise constructor call error
		//this();
 		System.out.println("B para");
 		
 		// either this() or super() must be called implicitly by compiler
	}
}
