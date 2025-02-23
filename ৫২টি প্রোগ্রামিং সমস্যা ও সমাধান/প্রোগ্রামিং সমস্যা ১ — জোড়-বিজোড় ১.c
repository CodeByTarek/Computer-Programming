#include <stdio.h>

int main() {
    
    int T, i, n;
    
    scanf("%d", &T);  // Take user input
    
    for(i = 1; i <= T; i++){
        scanf("%d", &n);
        
        if (n % 2 == 0) {  // ✅ Correct way to check even/odd
        printf("even\n");
    }
    
    else
        printf("odd\n");
    }
    
    return 0;
}