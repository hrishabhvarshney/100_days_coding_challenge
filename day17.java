/*program to check given no. is perfect number or not */
import java.util.Scanner;
public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++ ){
            if (n % i == 0){
                sum = sum + i;
            }
        }if (sum == n){
            System.out.println(n + " is a Perfect number");
        }else {
            System.out.println(n + " is not a Perfect number");
        }
    }
}
