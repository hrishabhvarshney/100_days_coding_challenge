/*Program to print the fibonacci Series*/
import java.util.Scanner;
public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 0, c = 1;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.print("The fibonacci series till " + n + " is : ");
        for (int i = 1; i <= n; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }
}
