T = int(input())  # Take number of test cases

for i in range(1, T + 1):  # Loop through test cases
    N = int(input())  # Input value for N
    
    divisors = []  # List to store divisors
    for j in range(1, N + 1):  # Loop from 1 to N to find divisors of N
        if N % j == 0:  # Check if j is a divisor of N
            divisors.append(j)  # Append divisor to the list
    
    # Print the case number and divisors without an extra space
    print(f"Case {i}: {' '.join(map(str, divisors))}")
