package QUESTION;

public interface Vehicle {

    // TODO: Define start method
    public void start();

    // TODO: Define stop method
    public void stop();

    // TODO: Define default honk method that prints "Honking..."
    default void honk() {
        System.out.println("Honking...");
    }

    // TODO: Define static displayType method that prints "Vehicle Type"
    static void displayType() {
        System.out.println("Vehicle Type");
    }
}
