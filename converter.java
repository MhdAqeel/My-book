import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the decimal value: ");
        int decimal = Scan.nextInt();
        System.out.print("what base do you want to convert to? ");
        int b = Scan.nextInt();
        Scan.close();

        int resulst=1;
        for (int i = 1; i <= 4; i++) {
               resulst = resulst * b; 
        }
        int maxnumber = resulst - 1;
        
        if (b >= 2 && b <= 9) {
            if (decimal > maxnumber) {
                System.out.println("The number is too large for the base");
            }    
            else {
                String binary = "";
                while (decimal != 0) {
                    int remainder = decimal % b;
                    decimal = decimal / b; 
                    binary = remainder + binary;
            }
            System.out.println("The number you entered in base " + b + " is : " +binary);
            }
        }
        else {
            System.out.println("Base should be between 2 and 9");
        }
        
    }
}
