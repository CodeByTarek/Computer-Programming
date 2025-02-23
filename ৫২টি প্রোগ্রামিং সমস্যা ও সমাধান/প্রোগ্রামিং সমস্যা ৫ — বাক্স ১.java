import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Read number of test cases
        
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();  // Read value of N for each test case

            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    System.out.print("*");
                }
                System.out.println();  // Move to the next line after each row
            }

            // Print a blank line between test cases, but NOT after the last test case
            if (i < T) {
                System.out.println();
            }
        }

        sc.close();  // Close scanner to avoid memory leaks
    }
}
