import java.util.Scanner;
// to find sum of elements of an array
public class ArraySum {

    public static void main(String[] args) {
         int sum = 0;
         // enter the number of elements in the array using scanner calss
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n = scanner.nextInt();

        //declare and initialize array
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");

        //scan the number until reach given number of elements
        for(int n1=0; n1<n; n1++){

            a[n1] = scanner.nextInt();
            sum = sum + a[n1];
        }
        //print the sum of the elements
        System.out.println("Sum of elements of array = " +sum );
    }
}
// end of program
