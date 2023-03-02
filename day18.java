/*Factors of a given number*/
import java.util.Scanner;
public class day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = sc.nextInt();
        System.out.printf("Factors of " + n + " are: ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.printf(i+ " ");
            }
        }
    }
}
