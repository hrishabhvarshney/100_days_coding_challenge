/*Program to find the sum of digits of a given no.*/
import java.util.Scanner;
public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0){
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println("Sum of digit " +n+ " is " +sum);
    }
}
