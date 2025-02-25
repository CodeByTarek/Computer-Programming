T = int(input())  # Read the number of test cases

for kase in range(1, T + 1):
    # Read three integers from input (all on one line, space-separated)
    n1, n2, n3 = map(int, input().split())
    
    # Sort the numbers in ascending order using the built-in sorted() function
    sorted_nums = sorted([n1, n2, n3])
    
    # Print the sorted numbers in the desired format
    print(f"Case {kase}: {sorted_nums[0]} {sorted_nums[1]} {sorted_nums[2]}")
