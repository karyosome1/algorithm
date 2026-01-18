import java.io.*;

public class Main {
    public static int[] getCnt(String s) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        String A, B;
        while ((A = br.readLine()) != null && (B = br.readLine()) != null) {
            int[] cntA = getCnt(A);
            int[] cntB = getCnt(B);

            StringBuilder line = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                int common = Math.min(cntA[i], cntB[i]);
                if (common > 0) {
                    line.append(String.valueOf((char)('a' + i)).repeat(common));
                }
            }
            out.append(line).append('\n');
        }
        System.out.print(out);
    }
}