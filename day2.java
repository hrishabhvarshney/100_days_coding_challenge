/*Write the program to identify if the character is a vowel or constant*/
import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the variable");
        char ch = in.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("The entered character " + ch + " is a vowel.");
        } else if ((ch >= 'a' && ch<= 'z') || (ch >= 'A' && ch  <= 'Z'))
        {
            System.out.println("The entered character " + ch + " is a Consonant.");
        }else{
            System.out.println("Invalid input! Please Enter the Alphabet.");
        }
    }
}
