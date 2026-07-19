import java.util.Scanner;

public class SimpleTextAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("No text entered.");
        } else {
            String[] words = sentence.split(" ");

            System.out.println();
            System.out.println("Text Analysis Report");
            System.out.println("--------------------");
            System.out.println("Original Text     : " + sentence);
            System.out.println("Uppercase         : " + sentence.toUpperCase());
            System.out.println("Lowercase         : " + sentence.toLowerCase());
            System.out.println("Character Count   : " + sentence.length());
            System.out.println("Word Count        : " + words.length);
            System.out.println("First Character   : " + sentence.charAt(0));
            System.out.println("Last Character    : " + sentence.charAt(sentence.length() - 1));
        }

        input.close();
    }
}
