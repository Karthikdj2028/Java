import java.util.*;

class AddTwoNumbers
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double sum = a + b;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}