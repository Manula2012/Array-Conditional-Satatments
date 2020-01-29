import java.util.Scanner;

//to find an array contains specific value
public class SpecificValue {

    public static void main(String[] args) {

        //declare and initialize array
        int[] num = {3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scanner.nextInt();
        int len = num.length;

        //check given number is equivalent to any element in array
        for (int i = 0; i < len; i++) {
            if (n == num[i]) {
                System.out.println("Array contains " +n);
            }


        }
    }
}
// end of program