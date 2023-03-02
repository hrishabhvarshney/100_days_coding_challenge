/*Check the given no. is even or odd */
import java.util.Scanner;
public class day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = in.nextInt();
        if(n % 2 == 0){
            System.out.println(n + " is a even number");
        }
        else {
            System.out.println(n + " is a odd number");
        }
    }
}
