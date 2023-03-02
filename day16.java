/*program to check given no. is strong or not*/
import java.util.Scanner;
public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp, rem, fact, i, sum = 0;
        temp = n;
        while(n > 0){
            rem = n % 10;
            fact = 1;
            for (i=1; i <= rem; i++){
                fact *= i;
            }
            sum += fact;
            n = n/10;
        }
        if ( sum == temp){
            System.out.println(temp + " is a STRONG NUMBER");
        } else {
            System.out.println(temp + " is not a STRONG NUMBER");
        }
    }
}
