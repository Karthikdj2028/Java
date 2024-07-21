import java.util.*;
 class whilesum
 {
    public static void main(String args []) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        double sum = 0.0;
        int i = 1;
        while (i <= n) {
            sum += 1.0 / i;
            i++;
        }
        System.out.println("The sum of the series is: " + sum);
    }
}