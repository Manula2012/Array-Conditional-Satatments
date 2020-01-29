import java.util.Scanner;

//to check the occurrences of a letter in a given string
public class OccurrencesOfa {
    public static void main(String[] args) {

        int count = 0;
        char ch = 'a';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = scanner.next();


          // scan the string up the end with length
          for(int i = 0; i < s.length(); i++) {
              // when given character and the character in the string is the same
            if (ch == s.charAt(i)) {
                ++count;
            }


        }//print the number of occurrences of the given letter
          System.out.print("Number of occurrences of a is ");
        System.out.println(count);


}
}// end of program