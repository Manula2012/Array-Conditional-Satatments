import java.util.Scanner;

// to count number of odd and even digits in a number
// find the total of odd numbers and even numbers
public class OddEvenSum {

    public static void main(String[] args) {

        int countOdd = 0;
        int countEven = 0;
        int sumOdd = 0;
        int sumEven = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 digit number");
        int n1 = scanner.nextInt();

        //scan the given number for the value>0
        while (n1 > 0) {
            int rem = n1%10;
            if(rem%2==0){
                countEven++;
                sumEven = sumEven + rem;
            }
            else
            { countOdd++;
                sumOdd = sumOdd + rem;
            }n1 = n1/10;

         // print the number of odd and even numbers and their totals
        }System.out.print("Total number of even digits  = " );
        System.out.println(countEven);
        System.out.print("Total of even digits  = " );
        System.out.println(sumEven);
        System.out.print("Total number of odd digits  = " );
        System.out.println(countOdd);
        System.out.print("Total of odd digits =");
        System.out.println(sumOdd);



    }
}
// end of program




