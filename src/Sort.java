import java.util.Arrays;
//to sort numeric array and string array
public class Sort {
    public static void main(String[] args) {

        //declare numeric array
        int num[] = {158, 833, 675, 961, 233, 365};

        // declare string array
        String words[] = {"Simple", "Secure", "Portable", "Dynamic", "Distributed", "Interpreted"};

        // sorting both arrays
        System.out.println("Original numeric array : " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted numeric array : " + Arrays.toString(num));
        System.out.println();
        System.out.println("Original string array :" + Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("Sorted string array :" + Arrays.toString(words));


    }
}
// end of program
