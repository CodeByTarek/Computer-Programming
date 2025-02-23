import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Read number of test cases
        
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();  // Read value of N for each test case
            
            System.out.print("Case " + i + ":");  // Print the case number
            
            // Loop from 1 to N to find divisors of N
            for (int j = 1; j <= N; j++) {
                if (N % j == 0) {  // Check if j is a divisor of N
                    System.out.print(" " + j);  // Print each divisor
                }
            }
            
            System.out.println();  // Print a new line after each case
        }
        
        sc.close();  // Close the scanner to avoid memory leak
    }
}
