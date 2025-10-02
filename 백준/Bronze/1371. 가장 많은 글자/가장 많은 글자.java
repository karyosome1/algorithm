import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int[] cnt = new int[26];

        // 로컬 IntelliJ 테스트 시: while ((line = br.readLine()) != null && !line.isEmpty())
        // 백준 제출 시: while ((line = br.readLine()) != null)
        while ((line = br.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    cnt[ch - 'a']++;
                }
            }
        }

        int max = 0;
        for (int c : cnt) {
            if (c > max) max = c;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (cnt[i] == max) sb.append((char) ('a' + i));
        }
        System.out.println(sb);
    }
}