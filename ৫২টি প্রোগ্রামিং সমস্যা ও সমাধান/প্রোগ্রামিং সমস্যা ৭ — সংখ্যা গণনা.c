int main() {
    int n;
    scanf("%d", &n);  // প্রথম লাইন থেকে সংখ্যার সংখ্যা (N) ইনপুট নিচ্ছি।
    getchar();  // নিউলাইন ক্যারেক্টার বাদ দিচ্ছি।

    char line[1000000];

    while (n--) {  // N সংখ্যক লাইন পড়তে হবে
        if (fgets(line, sizeof(line), stdin) == NULL) {
            return 1; // ইনপুট নিতে সমস্যা হলে প্রোগ্রাম বন্ধ হবে।
        }

        char *token = strtok(line, " \n"); // স্পেস বা নিউলাইনের মাধ্যমে টোকেন ভাগ করছি।
        int count = 0;

        while (token != NULL) {
            count++; // প্রতিটি সংখ্যার জন্য কাউন্ট বাড়াচ্ছি।
            token = strtok(NULL, " \n");
        }

        printf("%d\n", count); // বর্তমান লাইনে মোট কয়টি সংখ্যা আছে, তা প্রিন্ট করছি।
    }

    return 0;
}