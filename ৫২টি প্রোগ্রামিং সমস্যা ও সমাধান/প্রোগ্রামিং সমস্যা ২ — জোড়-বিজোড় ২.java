import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Take number of test cases
        sc.nextLine();  // Consume the newline character
        
        for (int i = 1; i <= T; i++) {
            String n = sc.nextLine();  // Read input as a string
            
            // Get last character of the string
            char lastChar = n.charAt(n.length() - 1);

            // Check if last digit is even or odd
            if (lastChar == '0' || lastChar == '2' || lastChar == '4' || 
                lastChar == '6' || lastChar == '8') {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        
        sc.close();  // Close the scanner (Best practice)
    }
}
