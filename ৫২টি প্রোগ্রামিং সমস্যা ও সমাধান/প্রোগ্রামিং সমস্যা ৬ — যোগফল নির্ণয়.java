import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T, N, x, y, total;
        
        T = sc.nextInt();  // Read number of test cases
        
        for (int i = 1; i <= T; i++) {  
            N = sc.nextInt();  // Read value of N for each test case
            
            x = N % 10;         // Extract last digit
            y = N / 10000;      // Extract first digit (for a 5-digit number)
            total = x + y;      // Calculate sum
            
            System.out.println("Sum = " + total); // Print result
        }
        
        sc.close(); // Close Scanner to prevent resource leaks
    }
}
