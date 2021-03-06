package Interface;


public class InterfaceExtends 
{
    public static void main (String[] args) 
    {
        ID objd = new ID();
        objd.show();
        objd.print();
        objd.display();
        
        System.out.println();
        
        
        IC objc = new ID();
        // IC will contain three methods 
        objc.display();
        objc.print();
        objc.show();
        
        
        System.out.println();
        
        IB objb = new ID();
        // IB ref will contain only one methods 
        objb.print();
        
        
        System.out.println();
        
        IA obja = new ID();
        // IA ref will contain only one defined method
        obja.show();
      //  obja.display();
        
    }
}

interface IA {
    public void show();
}
// interface can only be implements by class or abstract class as it requires to declare methods in class 
// interface cannot be implements by interface as it will not be able to declared method in it

// interface cannot by extends by class or abstract class
// here twist is interface can be extends by interface 
interface IB {
	public void print();
}

// can extends multiple interface
interface IC extends IA,IB {
    public void display();
}

class ID implements IC 
{
    public void show()
    {
        System.out.println("Show");
    }
    public void display()
    {
        System.out.println("Display");
    }
	public void print() {
		System.out.println("Print");
	}
}

