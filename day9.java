/*write the code to find roots of a quadratic equation*/
import java.util.Scanner;
public class day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c:");
        double c = sc.nextDouble();
        if (a == 0){
            System.out.println("Invalid input! a cannot be 0");
        }else {
            double d = Math.pow(b,2) - (4*a*c);
            if (d > 0){
                System.out.println("Roots are real and Different.");
                System.out.println("Roots are: " + ((-b + Math.sqrt(d))/(2*a)) + " and " + ((-b - Math.sqrt(d))/(2*a)));
            } else if (d == 0) {
                System.out.println("Roots are real and equal.");
                System.out.println("Roots are: " + (-b/(2*a)));
            }else {
                System.out.println("Roots are complex and different.");
                System.out.println("Roots are: " + (-b/(2*a)) + "+i" + Math.sqrt(-d)/(2*a) + "and" + (-b/(2*a)) + "-i" + Math.sqrt(-d)/(2*a));
            }
        }
    }
}
