import java.util.Scanner;

//to print fibonacci series of a given number
public class Fibonacci {

    public static void main(String[] args) {

        int n1=0;
        int n2=1;
        int n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of Fibonacci Series");
        int count = scanner.nextInt();


        System.out.print(n1+ " " +n2 );

        for (int i = 1; i < count-1; i++) {
            n3=n1+n2;
            System.out.print(" "+n3 );
            n1=n2;
            n2=n3;

        }
    }
}
//end of program