public class Car {

    int modelYear;
    String modelName;

    void honk() {
        System.out.println("Honk! Honk!");
    }

    public static Car createCar() {
        // TODO: Create a new Car object, set its variables, and return it
        Car myCar = new Car();
        myCar.modelYear = 2024;
        myCar.modelName = "Tesla Model S";

        return myCar;

    }

    public static int getModelYear(Car car) {
        // TODO: return the model year of the car
        return car.modelYear;
    }

    public static String getModelName(Car car) {
        // TODO: return the model name of the car
        return car.modelName;
    }

    public static void honk(Car car) {
        // TODO: call the honk method on the car object
        car.honk();
    }

    public static void main(String[] args) {
        Car tesla = Car.createCar();

        System.out.println(tesla.modelName);

        Car.getModelName(tesla);
    }
}
