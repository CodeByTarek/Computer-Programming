T = int(input())  # Take number of test cases

for i in range(1, T + 1):  # Loop through test cases
    N = int(input())  # Input value for N

    for j in range(1, N + 1):
        for k in range(1, N + 1):
            print("*", end="")  # Print stars in the same line
        print()  # Move to the next line after each row

    # Print a blank line **only between test cases**, NOT after the last test case
    if i < T:
        print()