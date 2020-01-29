import java.util.Scanner;

// to print the reversal of a given number
public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your Number");
        int num = scanner.nextInt();
        int rev = 0;

        //scan the given number for not equal to 0
        while (num!=0)
        { int num1 = num%10;
        rev = rev*10 + num1;
        num /= 10;
        }
        System.out.print("Reversed number is ");
        System.out.println(rev);


    }
}
// end of program