/*Find the quadrants in which co-ordinates lies*/
import java.util.Scanner;
public class day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x coordinate: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y coordinate: ");
        int y = sc.nextInt();
        if (x > 0 && y > 0){
            System.out.println("This point lies in the first quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("This point lies in the second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("This point lies in the third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("This point lies in the fourth quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("This point lies at the origin");
        } else if (x == 0 && y != 0) {
            System.out.println("This point lies on y axis");
        } else if (x != 0 && y == 0) {
            System.out.println("This point lies on x axis");
        }
    }
}
