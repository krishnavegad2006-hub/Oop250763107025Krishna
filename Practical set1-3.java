import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter a letter.");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel.");
        } else {
            System.out.println("It is a consonant.");
        }

        sc.close();
    }
}