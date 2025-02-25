#include <stdio.h>
#include <math.h>

int main(){
    int T, i, N, root;
    scanf("%d", &T);
    
    for(i = 1; i <= T; i++){
        scanf("%d", &N);
        
        // If negative, it's not a perfect square.
        if(N < 0){
            printf("NO\n");
            continue;
        }
        
        double sr = sqrt(N);
        root = (int) sr;  // This is floor(sr) when sr is positive
        
        // Check both root and root+1 in case of precision issues.
        if(root * root == N || (root+1) * (root+1) == N)
            printf("YES\n");
        else
            printf("NO\n");
    }
    return 0;
}