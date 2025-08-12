import java.io.*;

public class Main {
    private static final int[] COINS = {25, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine().trim());
            for (int j = 0; j < COINS.length; j++) {
                sb.append(c / COINS[j]);
                c %= COINS[j];
                if (j < COINS.length - 1) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}