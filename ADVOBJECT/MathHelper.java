public class MathHelper {
    
    // TODO: Define a static variable called 'PI' with the value of 3.14
    // TODO: Define a static method 'square' that takes an integer and returns its square
    static double PI = 3.14;
    static int square(int num){
        return num * num;
    }

    public static void main(String[] args) {
       
        System.out.println("The value of PI is: " + MathHelper.PI);
        int result = MathHelper.square(5);
        System.out.println("The square of 5 is: " + result);
    }
}
