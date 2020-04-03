
public class PrimitiveDatatype {

	public static void main(String[] args) {
		/*
		 * Primitive Datatype In Primitive datatype we create it as datatype 
		 * we dont creates its object also we cannot use function of their respective Wrapper Class
		 * function that are defined non-static and are called by objects 
		 * we can easily call static function of any Wrapper Class by using wrapper class name
		 */

		// 1 byte = 8 bit
		boolean b; // false     ||  1 bit-Smallest in all
		Boolean objb = new Boolean(true);
		System.out.println(objb);
		
		char c;    // '\u0000'  ||  2 byte
		Character objc = new Character('c');
		System.out.println(objc);
		
		byte by;   // 0 		||  1 byte
		Byte objby = new Byte((byte) 1452452456);
		System.out.println(objby); // something in typecasting
		
		short sh;  // 0 		||  2 byte
		Short objsh = new Short((short) 135412255);
		System.out.println(objsh); // something in typecasting
				
		int i;     // 0 		||  4 byte
		Integer obji = new Integer(654684654);
		System.out.println(obji);
				
		long l;    // 0L 		||  8 byte
		Long objl = new Long(1555422556);
		// in this we dont need to type cast it as it is bigger than int so it can easliy store int
		System.out.println(objl);
				
		float f;   // 0.0f 		||  4 byte
		Float objf = new Float(12254.41365574456);
		System.out.println(objf);
		
		double d;  // 0.0d 		||  8 byte
		Double objd = new Double(1546366.546546564);
		System.out.println(objd);
	}
}
