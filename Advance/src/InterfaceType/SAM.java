package InterfaceType;

public class SAM 
{
    // Invention is used mostly where you declare first and defined after ward
    // Discovery is used mostly where you define simultaneously 
    
    interface abc
    {
        void show();
    }
    interface xyz
    {
        void display(int k);
    }
        // Marker Interface - No Method
        // SAM - Single Abstract Method - Functional Interface
        // Normal Interface
       
    public static void main (String[] args) {
    
    // here it is obvoius that we will override only function
    // in SAM interface
    abc obj = () -> System.out.println("Show");
    
    xyz obb = (int k) -> System.out.println("Display "+k);
    
        obj.show();
        obb.display(10);
    }
}
