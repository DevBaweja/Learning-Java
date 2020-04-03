package AbstractClass;

public class Future
{
    public static void main (String[] args) {
        
        // A and B cannot form their objects
        A obj = new C();
        obj.call();
        obj.move();
        obj.dance();
        obj.cook();
    }
}
abstract class A {
    
    public void call()
    {
        System.out.println("Calling...");
    }
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}

abstract class B extends A
{
    public void move()
    {
        System.out.println("Moving...");
    }
}

class C extends B
{
    public void dance()
    {
        System.out.println("Dancing...");
    }
    public void cook()
    {
        System.out.println("Cooking...");
    }
}

