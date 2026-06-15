import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        try {
            // Convert base 2 string to base 10 integer
            int decimalValue = Integer.parseInt(binaryString, 2);
            System.out.println("Decimal equivalent: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number!");
        }
        
        scanner.close();
    }
}