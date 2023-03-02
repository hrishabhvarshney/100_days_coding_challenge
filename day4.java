/*Check enter no. is positive and negative*/
import java.util.Scanner;
public class day4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number");
        double n = in.nextDouble();
        if (n >= 0.0){
            if (n == 0.0){
                System.out.println("Number is equal to " + n);
            }
            else {
                System.out.println(n+ " is a positive number");
            }
        }else {
            System.out.println(n+ " is a negative number");
        }
    }
}
