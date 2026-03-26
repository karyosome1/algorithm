import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] words = new String[n];

            for (int i = 0; i < n; i++) {
                words[i] = br.readLine();
            }

            Map<String, Integer> countMap = new HashMap<>();
            Map<String, String> firstWordMap = new HashMap<>();

            for (String word : words) {
                char[] arr = word.toCharArray();
                Arrays.sort(arr);
                String key = new String(arr);

                countMap.put(key, countMap.getOrDefault(key, 0) + 1);
                firstWordMap.putIfAbsent(key, word);
            }

            int maxCount = -1;
            String answerWord = "";

            for (String word : words) {
                char[] arr = word.toCharArray();
                Arrays.sort(arr);
                String key = new String(arr);

                int count = countMap.get(key) - 1;

                if (count > maxCount) {
                    maxCount = count;
                    answerWord = word;
                }
            }

            sb.append(answerWord).append(" ").append(maxCount).append("\n");
        }

        System.out.print(sb);
    }
}
