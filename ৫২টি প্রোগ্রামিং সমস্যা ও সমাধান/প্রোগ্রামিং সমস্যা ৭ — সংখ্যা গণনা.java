import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // প্রথম লাইনে সংখ্যার সংখ্যা (N) ইনপুট নিচ্ছি।
        scanner.nextLine(); // নিউলাইন ক্যারেক্টার বাদ দিচ্ছি।

        while (n-- > 0) { // N সংখ্যক লাইন পড়তে হবে
            if (!scanner.hasNextLine()) {
                return; // ইনপুট নিতে সমস্যা হলে প্রোগ্রাম বন্ধ হবে।
            }

            String line = scanner.nextLine(); // সম্পূর্ণ লাইন ইনপুট নিচ্ছি।
            String[] tokens = line.trim().split("\\s+"); // স্পেস দিয়ে ভাগ করছি।

            int count = tokens.length; // সংখ্যাগুলোর সংখ্যা গণনা করছি।

            System.out.println(count); // বর্তমান লাইনে মোট কয়টি সংখ্যা আছে, তা প্রিন্ট করছি।
        }

        scanner.close();
    }
}
