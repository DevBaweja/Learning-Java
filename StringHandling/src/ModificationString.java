
public class ModificationString {

	public static void main(String[] args) {
		
		String k = new String();
		// Default Constructor
		
		//The Java String is immutable which means it cannot be changed. 
		// Whenever we change any string, a new instance is created.
		// For mutable strings, you can use StringBuffer and StringBuilder classes.
		
		String s = new String("Fill");
		// Parametric Constructor
		// now it is impossible to change s value
		// to make it change we need to call constructor once again 
		s = new String("it");
		System.out.println(s);
		
				/* but every time you change,modify this object 
				* an new object is created that contain modification and original is left unchanged
				* so we can collect that new object in original ones to make it appear 
				* that original string is being changed.
				*/
		
		s = s.replace('i', 't');
		System.out.println(s);
		
		/*
		* For making modifiable string we have 
		* StringBuffer Class every modification is applied to that string itself. 
		* Hence no new object is formed so we dont need to collect it into anything
		* it will change that string and previous string is lost
		*/
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		
		sb.replace(0,4,"ki");
		System.out.println(sb);
		
		// String, StringBuffer, StringBuilder implements CharSequence interface
	}
}
