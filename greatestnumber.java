import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        // Finding the greatest number
        int greatest = num1;
        
        if (num2 > greatest) {
            greatest = num2;
        }
        
        if (num3 > greatest) {
            greatest = num3;
        }
        
        // Printing the result
        System.out.println("The greatest number is: " + greatest);
        
        scanner.close();
    }
}