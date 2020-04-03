package Anonymous;

public class AnonymousObject
{
    @SuppressWarnings("unused")
	public static void main (String[] args) {
        
        int i = 10;
        // here i is primitive datatype
        // Stack Memory
        
        A obj;
        // here obj is ref
        // Stack Memory with hashcode
        
        obj = new A();
        // now object is created and it is non-primitive datatype
        // Heap Memory with hashcode of obj ref
        
        obj.show();
        // now if only purpose of the obj was to class show then we can create temp obj
        // that creating of temp obj is called anonymous object
        
        // in case you only need to that class once you should create anonymous  object
        new A().show();
        // only in Heap Memory no storage wastage in Stack Memory
        // Also it is now eligible for Garbage Collector also as it has not ref in Stack Memory
        
        // but while using class multiple time you should create it object
    } 
}

class A{
    public void show()
    {
        System.out.println("Show");
    }
}
