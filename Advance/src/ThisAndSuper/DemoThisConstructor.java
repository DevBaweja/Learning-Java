package ThisAndSuper;

public class DemoThisConstructor{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ThisConstructor obj = new ThisConstructor();
	}
}
 
class ThisConstructor {

	int a,b;
	// there is this in constructor as it is also instance method
	
	public ThisConstructor() 
	{
		// TODO Auto-generated constructor stub
		this(1,1);
	}
		
	public ThisConstructor(int a,int b)
	{
		System.out.println("Parametric constructor is called from Default Constructor via this method");
		this.a = a;
		this.b = b;
	}

}