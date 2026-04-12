
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine().trim();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        int maxFrequency = 0;
        String mostFrequentWord = "";

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            int freq = entry.getValue();
            String word = entry.getKey();

            if (freq > maxFrequency || (freq == maxFrequency && word.compareTo(mostFrequentWord) > 0)) {
                maxFrequency = freq;
                mostFrequentWord = word;
            }
        }

        System.out.println(mostFrequentWord + " " + maxFrequency);
        sc.close();
    }
}
