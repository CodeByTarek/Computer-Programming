import sys

# প্রথম লাইনে সংখ্যার সংখ্যা (N) ইনপুট নিচ্ছি।
n = int(sys.stdin.readline().strip())  

for _ in range(n):  # N সংখ্যক লাইন পড়তে হবে
    line = sys.stdin.readline().strip()  # সম্পূর্ণ লাইন ইনপুট নিচ্ছি
    if not line:
        continue  # যদি লাইন খালি হয়, পরবর্তী লুপে চলে যাই

    tokens = line.split()  # স্পেস দিয়ে ভাগ করছি
    count = len(tokens)  # সংখ্যাগুলোর সংখ্যা গণনা করছি

    print(count)  # বর্তমান লাইনে মোট কয়টি সংখ্যা আছে, তা প্রিন্ট করছি
