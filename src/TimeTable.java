import java.util.Scanner;

// to print time table of a given number up to a given limit
public class TimeTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the timetable you want to print");
        int n = scanner.nextInt();
        System.out.print("Please enter the ending value of the timetable");
        int n1 = scanner.nextInt();
        int i= 1;

        do {// print the time table
            System.out.print(+n+ " * " +i+ " = ");
            System.out.println(n*i);
            i++;

        }
        // scan to check whether reached up to the limit
        while(i<=n1);
    }

}
// end of program