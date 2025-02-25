import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        for (int kase = 1; kase <= T; kase++) {
            // Read three integers from input
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            
            // Sort the numbers in ascending order
            
            // Ensure n1 is the smallest
            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            if (n1 > n3) {
                int temp = n1;
                n1 = n3;
                n3 = temp;
            }
            // Ensure n2 is the middle value
            if (n2 > n3) {
                int temp = n2;
                n2 = n3;
                n3 = temp;
            }
            
            // Print the sorted numbers for the current test case
            System.out.println("Case " + kase + ": " + n1 + " " + n2 + " " + n3);
        }
        
        // Close the scanner to free resources
        scanner.close();
    }
}
