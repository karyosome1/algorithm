import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int winner = 1;
        int winnerScore = -1;

        int[] cards = new int[5];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                cards[j] = Integer.parseInt(st.nextToken());
            }

            int best = 0;
            for (int a = 0; a < 3 && best != 9; a++) {
                for (int b = a + 1; b < 4 && best != 9; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        int score = (cards[a] + cards[b] + cards[c]) % 10;
                        if (score > best) best = score;
                        if (best == 9) break;
                    }
                }
            }

            if (winnerScore <= best) {
                winnerScore = best;
                winner = i;
            }
        }
        System.out.println(winner);
    }
}