/*Write a program to find Ascii value of a character*/
import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);
        int ascii_value = ch;
        System.out.println("The ASCII value 0f "+ ch + " is: " + ascii_value);
    }
}
