/*Program to find the factorial of a number */
import java.util.Scanner;
public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        double fact = 1;
        if (n<0){
            System.out.println("Factorial does not exit for negative numbers");
        } else if (n == 0) {
            System.out.println("Factorial of 0 is 1");
        }else {
            for (double i = 1; i <= n; i++)
                fact = fact * i ;
            System.out.println("The factorial of " + n + " is " + fact);
        }
    }
}
