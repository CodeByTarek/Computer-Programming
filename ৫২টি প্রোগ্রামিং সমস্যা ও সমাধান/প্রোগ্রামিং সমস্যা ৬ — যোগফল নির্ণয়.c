#include <stdio.h>

int main() {
int T, N, i, x, y, sum;

scanf("%d", &T);

for(i = 1; i <= T; i++){
    scanf("%d", &N);
    
    x = N % 10;

    y = N / 10000;

    sum = x + y;
    printf("Sum = %d\n", sum);
}
    return 0;
}
