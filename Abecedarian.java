import java.util.Scanner;
public class Abecedarian 
{
    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = Scan.next();
        Scan.close();

        boolean abecedarian = true; 
        int length = word.length();
        System.out.println("The length of the word is: " + length);

        for (int i = 0; i < length - 1; i++) { // Iterate until length-1
            if (word.charAt(i) > word.charAt(i + 1)) {
                abecedarian = false;
                System.out.println("The word is not abecedarian");
                break;
            }
        }

        if (abecedarian) {
            System.out.println("The word is abecedarian");
        }
    }
}


















