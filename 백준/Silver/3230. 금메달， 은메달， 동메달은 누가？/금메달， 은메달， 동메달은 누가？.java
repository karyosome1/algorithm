import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] firstRank = new int[n + 1];
        int[] secondRank = new int[m + 1];

        for (int player = 1; player <= n; player++) {
            int rank = Integer.parseInt(br.readLine());

            for (int j = player - 1; j >= rank; j--) {
                firstRank[j + 1] = firstRank[j];
            }
            firstRank[rank] = player;
        }

        for (int i = 1; i <= m; i++) {
            int rank = Integer.parseInt(br.readLine());

            int player = firstRank[m - i + 1];

            for (int j = i - 1; j >= rank; j--) {
                secondRank[j + 1] = secondRank[j];
            }
            secondRank[rank] = player;
        }

        System.out.println(secondRank[1]);
        System.out.println(secondRank[2]);
        System.out.println(secondRank[3]);
    }
}