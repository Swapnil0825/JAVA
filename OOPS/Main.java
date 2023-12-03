import java.util.Arrays;

public class Main {

    static String numberToWords(int n) {
        String[] words = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tensWords = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (n < 20) {
            return words[n];
        } else if (n < 100) {
            return tensWords[n / 10] + words[n % 10];
        } else {
            words = Arrays.copyOfRange(words, 1, words.length); // remove the empty string at the start
            if (n % 100 == 0) {
                return words[n / 100] + "hundred";
            } else {
                return words[n / 100] + "hundredand" + numberToWords(n % 100);
            }
        }
    }

    public static void main(String[] args) {
        int totalChars = 0;

        for (int i = 1; i <= 600; i++) {
            String words = numberToWords(i);
            int chars = countAlphabets(words);
            totalChars += chars;
        }

        System.out.println("Total number of alphabet characters used: " + totalChars);
    }

    static int countAlphabets(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
