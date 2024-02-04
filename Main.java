import java.util.*;

public class Main {

    protected Scanner sc = new Scanner(System.in);

    public Scanner getScannerObject() {
        return sc;
    }

    public void setScannerObject(Scanner sc) {
        this.sc = sc;
    }

    public static void main(String[] args) throws InterruptedException, InputMismatchException {
        Main ClassInstance = new Main();
        ClassInstance.findPalindromeChecker();
        ClassInstance.calculateSumOfEvenNums();
        ClassInstance.getVowelsAndConsonants();
        ClassInstance.displayASCIIAlphabet();
        ClassInstance.printNumberPattern();
    }

    public void findPalindromeChecker() throws InterruptedException, InputMismatchException {

        System.out.print("Enter a string to check for a palindrome: ");
        System.out.print("");

        String palindromeString = sc.nextLine();
        String reversed = "";

        for (int i = palindromeString.length() - 1; i >= 0; i--) {
            reversed += palindromeString.charAt(i);
        }

        System.out.println("");

        if (palindromeString.equals(reversed)) {
            System.out.println("Your word is a palindrome!");

        } else {
            System.out.println("Sorry, your word isn't a palindrome.");
        }

        System.out.println("");
        Thread.sleep(800);
    }

    public void calculateSumOfEvenNums() throws InterruptedException, InputMismatchException {

        System.out.print("How many even numbers do you want to have added up? | Numbers to be added up: ");
        System.out.print("");

        int count = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int evenNumber = i * 2;
            sum += evenNumber;
        }

        System.out.println("\nSum: " + sum);

        System.out.println("");
        Thread.sleep(800);
    }

    public void getVowelsAndConsonants() throws InterruptedException, InputMismatchException {

        System.out.print("Enter a string to check for vowels and consonants: \n");
        System.out.print("");

        sc.nextLine();

        String checkString = sc.nextLine();

        checkString.toLowerCase();

        int vowel = 0;
        int consonant = 0;

        for (int i = checkString.length() - 1; i >= 0; i--) {
            if (checkString.charAt(i) == 'a'
                    || checkString.charAt(i) == 'e'
                    || checkString.charAt(i) == 'i'
                    || checkString.charAt(i) == 'o'
                    || checkString.charAt(i) == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }

        System.out.println("You have " + vowel + " vowels.");
        System.out.println("You have " + consonant + " consonants.");

        System.out.println("");
        Thread.sleep(800);
    }

    public void displayASCIIAlphabet() throws InterruptedException {

        char[] alphabet = new char[26];

        System.out.println("ASCII values and characters from 'A' to 'Z': ");

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);

            char ASCIILetter = alphabet[i];
            int ASCIIValue = (int) alphabet[i];

            System.out.println(ASCIILetter + " = " + ASCIIValue);
        }

        System.out.println("");
        Thread.sleep(1200);
    }

    public void printNumberPattern() throws InterruptedException {

        System.out.println("Printed pattern of a right angle triangle of numbers: ");

        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
