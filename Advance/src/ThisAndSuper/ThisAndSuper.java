package ThisAndSuper;

public class ThisAndSuper {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		B objb = new B();
	}
}
// When used as methods it can only be used by 
// constructors and not in methods
// unlike this and super ref that can be called in instance methods 

class A{
	int a;
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("A");
	}
}

class B extends A	{
	int b;
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("B");
	}
}

// Also default constructor is created implicity by the compiler
// only if you have not defined any other constructor
// if you define your own parametric constructor then default constructor will not be created by JVM