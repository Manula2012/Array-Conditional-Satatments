import java.util.Scanner;

//to count words and spaces of a given string
public class WordSpaceCount {
    public static void main(String[] args) {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence :");
        String s = sc.nextLine();

        // give the word count without regex
        for (int i = 0; i < s.length(); i++) {
            //
            char ch = s.charAt(i);
            if (ch == ' ') {
                ++count;
            }

        }
        // print number of words and spaces
        System.out.print("Number of spaces in the sentence = ");
        System.out.println(count);
        System.out.print("Number of words in the sentence =");
        System.out.println(++count);
    }
}
//end of program
















