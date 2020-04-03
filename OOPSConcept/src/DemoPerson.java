
public class DemoPerson {

	public static void main(String[] args) {
		Person P1 = new Person(); 
		//P1.showPerson(); // methods are called through objects 
		P1.readPerson();
		P1.showPerson();
		
		// we cannot access P1.name P1.age P1.address as they are defined as private
		System.out.println("using parameteric constructor");
		Person P2 = new Person("jai",19,"jnv");
		P2.showPerson();
		// parametric constructor
		System.out.println("copy constructor");
		Person P3 = new Person(P1);
		P3.showPerson();
	}

}
