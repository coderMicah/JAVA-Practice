package INITIALIZATIONBLOCKS.Instance;

public class InstanceInitialization {

    // Instance variables
    int x;
    int y;

    // Instance initialization blocks
    {
        x = 10;
        y = 20;
    }

    // Constructor -> method called when a new object is created
    public InstanceInitialization() {
        System.out.println("In Construcctor x is " + x + " and y is " + y);
    }
}
