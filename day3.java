/*Write a program to identify if the character is an alphabet or not*/
import java.util.Scanner;
public class day3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = in.next().charAt(0);
        if (Character.isAlphabetic(ch)){//we can also use ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an Alphabet");
        }else {
            System.out.println(ch + " is not an Alphabet");
        }
    }
}
