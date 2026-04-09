import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = 1;

        while (true) {
            String line = br.readLine();
            if (line == null) break;

            String[] input = line.trim().split("\\s+");
            int n = Integer.parseInt(input[0]);
            if (n == 0) break;

            String alphabet = input[1];

            List<String> dataset = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                dataset.add(br.readLine());
            }

            int[] lookUpTable = new int[26];
            for (int i = 0; i < 26; i++) {
                lookUpTable[alphabet.charAt(i) - 'A'] = i;
            }

            System.out.println("year " + year);

            dataset.stream()
                   .sorted((a, b) -> compareTo(a, b, lookUpTable))
                   .forEach(System.out::println);

            year++;
        }
    }

    public static int compareTo(String value, String anotherString, int[] lookUpTable) {
        int len1 = value.length();
        int len2 = anotherString.length();
        int lim = Math.min(len1, len2);

        int k = 0;
        while (k < lim) {
            int c1 = lookUpTable[value.charAt(k) - 'A'];
            int c2 = lookUpTable[anotherString.charAt(k) - 'A'];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }
}