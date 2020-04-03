// When you dont know how much variable you will passing
// In order to do this we can alse use 
public class VarArgs {
	
	public static void main(String[] args) {
		
		
		
		Display.show(1); // here i dont know how many argument i want to pass
		Display.show(1,2);
		Display.show(1,2,3);
		Display.show(1,2,3,4);
		
		System.out.println();
		System.out.println();
		
		int []b = new int[]{1,2,3}; // way of initialising array element
		for (int i = 0; i < b.length; i++) 
			System.out.print(b[i]);
		
		System.out.println();
		Display.show(b); // we can also pass arrays here 
			
	}
}

class Display{
	
	public static void show(int ... a) // here it will act as array
	{
		/* for-each loop
		 
		   for(int i : a)
			System.out.print(i);
		*/
		
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i]);
	
		System.out.println();
	}	
}
