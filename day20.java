/*Identify given no. is Armstrong or not*/
import java.util.Scanner;
public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer you want to check : ");
        int num = sc.nextInt();
        int sum = 0;
        int count=0,a,b,c;
        a = c = num;
        while (a > 0){
            a = a / 10;
            count ++;
        }
        while(num>0){
            b = num % 10;
            sum = (int)(sum+Math.pow(b,count));
            num = num / 10;
        }
        if (sum == c){
            System.out.println("Given number " + c + " is an Armstrong Number");
        }else {
            System.out.println("Given number " + c + " is not an Armstrong Number");
        }
    }
}
