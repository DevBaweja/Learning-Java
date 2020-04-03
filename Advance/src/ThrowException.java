public class ThrowException {

	public static void main(String[] args) {

		System.out.println(fun.abc(1, -2, 3));
		// run time error
	}
}

class fun {

	public static int abc(int a,int b,int c)
    {
        if(a<=0 || b<=0 || c<=0)
        throw new  IllegalArgumentException("All para must br +ve");
        else 
        return a+b+c;
    }
}
