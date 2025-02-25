import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();  // Read number of test cases
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();  // Read the integer N
            
            // If N is negative, it's not a perfect square.
            if (N < 0) {
                System.out.println("NO");
                continue;
            }
            
            // Compute the square root as a double.
            double sr = Math.sqrt(N);
            // Cast to int, which gives the floor value for positive numbers.
            int root = (int) sr;
            
            // Check both root*root and (root+1)*(root+1) to account for precision issues.
            if (root * root == N || (root + 1) * (root + 1) == N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
