import math

# Read the number of test cases
T = int(input().strip())

for _ in range(T):
    N = int(input().strip())  # Read the integer N
    
    # If N is negative, it's not a perfect square.
    if N < 0:
        print("NO")
        continue
    
    # Compute the square root of N.
    sr = math.sqrt(N)
    # Get the integer part (floor) of the square root.
    root = int(sr)
    
    # Check both root*root and (root+1)**2 to handle potential precision issues.
    if root * root == N or (root + 1) * (root + 1) == N:
        print("YES")
    else:
        print("NO")
