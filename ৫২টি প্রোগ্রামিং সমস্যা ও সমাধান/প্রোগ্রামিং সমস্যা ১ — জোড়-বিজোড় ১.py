T = int(input())  # Take the number of test cases

for i in range(1, T + 1):  # Loop from 1 to T (inclusive)
    n = int(input())  # Take input for each test case
    
    if n % 2 == 0:  # Check even/odd
        print("even")
    else:
        print("odd")