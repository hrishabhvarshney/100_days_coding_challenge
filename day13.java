/*program to find the sum of first N natural number*/
import java.util.Scanner;
public class day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of " + n + "natural number is equal to: " + sum);
    }
}
