import java.util.*;

class SwapTwoNumbers 
{
    public static void main(String args []) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}