package String;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class __Constructors {

	public static void main(String[] args) {
		// s is String Class Object
		
		String s = "Hello";
		 // " " is string literal and an object is automatically generated
		// we can call methods as if it an String Object
		System.out.println("abc".getClass());
		System.out.println("abcd".length());
		// By string literal
		// String objects are stored in a special memory area known as the "string constant pool"
		// no new objects are created if it exists already in the string constant pool
		String s1 = "Hello";

		System.out.println(s);
		
		s = new String();
		// Default Constructor
		System.out.println(s);
		
		
		
		s = new String("World");
		// String(String original)
		// Parametric Constructor
		System.out.println(s);
		
		String k = new String(s);
		// String(String original)
		// Copy Constructor
		System.out.println(k);
		
		char c[] = new char[]{'a','b','c','d','e','f'};
		
		// String(char[] value)
		s = new String(c);
		System.out.println(s);
		
		
		// String(char[] value,int offset,int count)
		s = new String(c,2,3);
		System.out.println(s);
		
		// although java char uses 16 bit unicode
		byte ascii[] = new byte[]{42,12,54,35,75,41,45,51};
		// byte has value of -127 to 127 
		// Mostly Charset are defined properly in that interval 32 to 127
		
		// String(byte[] bytes)
		s = new String(ascii);
		System.out.println(s);
		
		// String(byte[] bytes,int offset,int length)
		s = new String(ascii, 2, 3);
		System.out.println(s);
		
		// String(byte[] bytes, Charset charset)
		// String(byte[] bytes,int offset,int length,Charset charset)
		System.out.println(Charset.forName("UTF-8").getClass());
		s = new String(ascii, Charset.forName("UTF-8"));
		System.out.println(s);

		// String(byte[] bytes,String charsetName)
		// String(byte[] bytes,int offset,int length,String charsetName)
		try {
			s = new String(ascii,"ASCII");
		} catch (UnsupportedEncodingException e) {
			System.out.println("Wrong Charset name");
		}
		System.out.println(s);
		
		//  String(int[] codePoints,int offset,int count)
		// Some Charset are defined properly in that interval 32 to 255
		
		int i[] = new int[]{142,128,35,41,245,51,45};
		s = new String(i, 2, 3);
		System.out.println(s);
		
		// These are used to create mutable String Objects as String Class Objects are immutable
		
		// String(StringBuffer buffer)
		StringBuffer sbuffer = new StringBuffer("buffer");
		System.out.println(sbuffer.getClass());
		s = new String(sbuffer);
		System.out.println(s.getClass());
		// this changes sbuffer Object of StringBuffer Class into s Object of String Class
		System.out.println(s);
		
		// String(StringBuilder builder)
		StringBuilder sbuilder = new StringBuilder("builder");
		System.out.println(sbuilder.getClass());
		s = new String(sbuilder);
		System.out.println(s.getClass());
		// this will change sbuilder Object of StringBuilder into s Object of String Class
		System.out.println(s);
		
		// String(byte[] ascii,int hibyte)
		// String(byte[] ascii,int hibyte,int offset,int count)
		 s = new String(ascii,2);
		 // it dont convert properly
		 // use constructor that takes Charset,charsetName
		//System.out.println(s);

	}
}
