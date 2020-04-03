 public class MainElements{
	
				// Without main, declaring some varibles
				// we will find that every variable (Object) is present in java extension  
	
	// These Are Main Representation 
	
			 	int a;
			 	float b;
			 	String c;
			 	// they are represented as same
			 	// Blue Triangle 
			 	
			 	// Access Specifiers are basic design
			 	// In all the variables declaration there is white dot in middle of it
			 	
			 	public int p; // Green Circle
			 	int q; // Blue Triangle
			 	protected int r; // Yellow Vertical Triangle
			 	private int g; // Red Curved Rectangle
			 // private variables and function will give warning if not use or called as their only scope is only limited to this class
			 	
			 	public void pubfun() // Green Circle
			 	{
			 		
			 	}
			 
			 	void frifun() // Blue Triangle
			 	{
			 		
			 	}
			 	protected void profun() // Yellow Vertical Rectangle
			 	{
					
			 	}
			 	private void prifun() // Red Curved Rectangle
			 	{
					
				}
			 	
			 	// it will be function with passing parameters datatype and return type is mention after an colon 
				public int fun(float a)
				{
					int k=0;
					return k;
				}
				
				// There will be S for Static variables
				public static int m;
				
				// There will be F for Final variables
				public static final String ch = "Hi";
				// Final Variables must be initialze
			
				public final int n=0;
				// for finding the effect of final but not static in order
				
				private static final void function()
				{
					
				}
				
			// There will be C for Constructor and it will treated as function
				
			 public MainElements() 
			 {
				// TODO Auto-generated constructor stub
			}
			 
			 //
			 
			 /* 
			  * Order By:
			  *  Static variables,functions
			  *  Variables
			  *  Constructors
			  *  Functions
			  */
 }
