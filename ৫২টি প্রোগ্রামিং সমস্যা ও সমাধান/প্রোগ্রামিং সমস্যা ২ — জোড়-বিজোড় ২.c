#include <stdio.h>
#include <string.h>  // Include for strlen()

int main() {
    
    int T, i; 
    char n[101];  // String input
    
    scanf("%d", &T);  // Take number of test cases
    
    for(i = 1; i <= T; i++){
        scanf("%s", n);  // Read input as a string

        // Get last character of the string
        char last_char = n[strlen(n) - 1];

        // Check if last digit is even or odd
        if (last_char == '0' || last_char == '2' || last_char == '4' || 
            last_char == '6' || last_char == '8') {
            printf("even\n");
        } else {
            printf("odd\n");
        }
    }
    
    return 0;
}
