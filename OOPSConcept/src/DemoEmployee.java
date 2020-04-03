
public class DemoEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.showEmployee();
		
		Employee ef = new Employee("dev", 13, "3d32", 124, 512.54f, "manager");
		ef.showEmployee();
		
		Employee efcopy = new Employee(ef);
		efcopy.showEmployee();
		
	}
}
