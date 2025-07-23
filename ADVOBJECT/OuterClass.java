public class OuterClass {

    static class StaticNestedClass {
        public void printMessage() {
            System.out.println("Hello from the static nested class");
        }
    }

    class InnerClass {
        public void printMessage() {
            System.out.println("Hello from the inner class");
        }
    }

    public void displayLocalClassMessage() {
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("Hello from the local inner class");
            }
        }

        // TODO: Instantiate the local inner class and call its printMessage method
        LocalInnerClass innerClass = new LocalInnerClass();
        innerClass.printMessage();
    }

    public static void main(String[] args) {
        // TODO: Instantiate the static nested class and call its printMessage method
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.printMessage();

        // TODO: Instantiate the outer class, then instantiate the inner class and call
        // its printMessage method
        OuterClass nestedClass = new OuterClass();
        OuterClass.InnerClass outerInner = nestedClass.new InnerClass();
        outerInner.printMessage();

        // TODO: Call the displayLocalClassMessage method that displays the message from
        // the local inner class
        OuterClass localInnerClass = new OuterClass();
        localInnerClass.displayLocalClassMessage();
    }
}
