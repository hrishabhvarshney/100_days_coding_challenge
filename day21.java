/*Write a java program to identify no. is prime no. or not*/
import java.util.*;
public class day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int count = 0;
        if (n <= 1){
            System.out.println(n+ " is not a prime no.");
        }else {
            for (int i = 2; i <= n; i++){
                if (n % i == 0){
                    count++;
                }
            }
            if (count >= 2){
                System.out.println(n+ " is not a prime no.");
            }else{
                System.out.println(n+ " is a prime no.");
            }
        }
    }
}
