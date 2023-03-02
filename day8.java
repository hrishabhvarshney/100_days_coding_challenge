/*Find the no. of days in a given month*/
import java.util.Scanner;
public class day8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int y = in.nextInt();
        System.out.print("Enter the month: ");
        int x = in.nextInt();
        if (((x == 2) && (y % 400 == 0)) || ((x == 2) && (y % 100 !=0) && (y%4 == 0))){
            System.out.println("Number of days is 29");
        } else if (x == 2){
            System.out.println("Number of days is 28"); 
        } else if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12){
            System.out.println("Number of days is 31");
        } else if (x == 4 || x == 6 || x == 9 || x == 11) {
            System.out.println("Number of days is 30");
        } else {
            System.out.println("Invalid data");
        }
    }
}
