package NESTEDCLASSES.InnerClass;

public class Main {

    public static void main(String[] args) {
        Outer examClass = new Outer();
        Outer.NestedClass nestedClass = examClass.new NestedClass();
        nestedClass.printMessage();
    }
}
