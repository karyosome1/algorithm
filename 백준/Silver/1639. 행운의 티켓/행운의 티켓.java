import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        int n = s.length();

        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (s.charAt(i) - '0');
        }

        for (int len = (n / 2) * 2; len >= 2; len -= 2) {
            int half = len / 2;
            for (int start = 0; start + len <= n; start++) {
                int leftSum = prefix[start + half] - prefix[start];
                int rightSum = prefix[start + len] - prefix[start + half];
                if (leftSum == rightSum) {
                    System.out.println(len);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}