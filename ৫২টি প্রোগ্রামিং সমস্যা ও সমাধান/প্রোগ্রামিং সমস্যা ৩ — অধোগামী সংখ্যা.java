class Main {
    public static void main(String[] args) {
        
        for (int i = 1000; i >= 1; i--) {
            System.out.print(i + "\t");  // Print number followed by a tab

            if (i % 5 == 1) {
                System.out.println();  // Print a new line if i % 5 == 1
            }
        }
    }
}
