T = int(input())  # Take number of test cases

for i in range(1, T + 1):  # Loop through test cases
    N = int(input())  # Input value for N
    
    x = N % 10  # Get last digit
    y = N // 10000  # Get first digit (for a 5-digit number)
    
    total = x + y  # Avoid using 'sum' as a variable name (it's a built-in function)
    print("Sum =", total)  # Removed 'end=' ' to ensure proper line breaks
