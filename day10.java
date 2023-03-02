/*program  to find the number of digits in a given integer*/
import java.util.Scanner;
public class day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0){
            n = n / 10;
            count++;
        }
        System.out.println("Number of digit in the entered number are: " + count);
    }
}
