import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[26];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            count[s.charAt(0) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (count[i] >= 5) sb.append((char) ('a' + i));
        }
        System.out.println(sb.length() == 0 ? "PREDAJA" : sb);
    }
}
