import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Read the number of test cases
        
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();  // Read each number
            
            if (n % 2 == 0) {  
                System.out.println("even"); 
                
            } else {
                System.out.println("odd");
            }
        }
        
        sc.close();  // Close the scanner (best practice)
    }
}