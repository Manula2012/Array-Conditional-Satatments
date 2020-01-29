import java.util.Scanner;

// to check whether a given number is Armostrong number or not
public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 Digit Number");
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;

        // scan the given number for value >0 then follow the method
        while (num > 0) {

            int rem = num % 10;
            sum = sum + (rem*rem*rem);

            num /= 10;
        }
        if (sum == temp)

        {System.out.println(temp+ " is a Amstrong Number");
        }
        else {
            System.out.println(temp+ " is not a Amstrong Number");
        }
    }
}
// end of program