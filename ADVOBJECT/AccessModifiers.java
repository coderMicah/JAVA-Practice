public class AccessModifiers {

    // TODO: Declare a public field for name (String)
    // TODO: Declare a private field for salary (double)
    // TODO: Declare a field with default access modifier for department (String)
    public String name;
    private double salary;
    String department;

    // TODO: Implement a public method to display employee details

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    // TODO: Implement a getter for private field salary
    public double getSalary() {
        return salary;
    }

    // TODO: Implement a setter for private field salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
