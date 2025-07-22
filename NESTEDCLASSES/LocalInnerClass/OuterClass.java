package NESTEDCLASSES.LocalInnerClass;

public class OuterClass {
    public void someMethod() {
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("Hello from LocalInnerClass");
            }
        }

        LocalInnerClass someVariable = new LocalInnerClass();
        someVariable.printMessage();

    }
}
