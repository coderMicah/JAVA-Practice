package ABSRTACTCLASS;

public class Dog extends Animal {

    public Dog(int age, String name, String type) {
        super(age, name, type);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

}
