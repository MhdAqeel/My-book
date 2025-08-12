import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = Scan.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = Scan.nextLine();
        Scan.close();
        
        // Convert both strings to lowercase
        String str3 = str1.toLowerCase();
        String str4 = str2.toLowerCase();

        // Check if lengths are different
        if (str3.length() != str4.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            boolean isAnagram = true;
            int[] charCount = new int[256]; // Assumes ASCII characters

            // Count characters in the first string
            for (int i = 0; i < str3.length(); i++) {
                charCount[str3.charAt(i)]++;
            }

            // Subtract character counts using the second string
            for (int i = 0; i < str4.length(); i++) {
                charCount[str4.charAt(i)]--;
            }

            // Check if any character count is not zero
            for (int count : charCount) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }

            // Print the result
            if (isAnagram) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
    }
}