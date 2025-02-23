T = int(input())  # Take number of test cases

for _ in range(T):
    n = input().strip()  # Read input as a string and remove extra spaces

    # Get the last character of the string
    last_char = n[-1]

    # Check if last digit is even or odd
    if last_char in '02468':
        print("even")
    else:
        print("odd")
