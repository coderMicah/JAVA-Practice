package ABSRTACTCLASS;

//astrcat keyword use to identify this class as an astract class
public abstract class Animal {
    int age;
    String name;
    String type;

    public Animal(int age, String name, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void makeSound();

}
