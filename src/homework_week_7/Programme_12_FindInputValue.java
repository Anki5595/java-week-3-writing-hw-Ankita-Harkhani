package homework_week_7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char ch = scanner.next().charAt(0);
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //closing scanner object
        scanner.close();
    }

    //find the input is ALPHABET, DIGIT, AND SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }
}
