package duncan;
public class OutputDemo {
    public static void main(String[] args) {
        System.out.print("first name:");
        System.out.println("John");
        System.out.print("last name:");
        System.out.println("Tyler");
        int first = 3, second = 8;
        System.out.print("first = " + first + ", second = " + second);
        double average = (first + second) / 2;
        System.out.println("Average = " + average);
        String firstName = "John";
        System.out.println("first name: " + firstName);
        String name = "John Tyler";
        System.out.println("name: " + name);
        System.out.println("3 / 5 * 5 = " + (3 / 5 * 5));
        System.out.println("3 / 5 * 5.0 = " + (3 / 5 * 5.0));
        System.out.println("3 / 5.0 * 5 = " + (3 / 5.0 * 5));
        double price = 3.5;
        int quantity = 15;
        double amount = price * quantity;
        double length = 30, width = 40;
        double diagonal = Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
        System.out.println("diagonal = sqroot(length^2 + width^2) = " + diagonal);
    }
}