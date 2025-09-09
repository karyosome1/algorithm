import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        char[] pattern = br.readLine().toCharArray();

        for (int k = 1; k < n; k++) {
            String s = br.readLine();
            for (int i = 0; i < pattern.length; i++) {
                if (pattern[i] != '?' && pattern[i] != s.charAt(i)) {
                    pattern[i] = '?';
                }
            }
        }

        System.out.println(pattern);
    }
}