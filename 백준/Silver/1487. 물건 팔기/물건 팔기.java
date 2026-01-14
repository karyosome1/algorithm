import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] maxPay = new int[n];
        int[] ship = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            maxPay[i] = Integer.parseInt(st.nextToken());
            ship[i] = Integer.parseInt(st.nextToken());
        }

        int[] candidates = Arrays.stream(maxPay).distinct().sorted().toArray();

        long bestProfit = 0;
        int bestPrice = 0;

        for (int p : candidates) {
            long profit = 0;
            for (int j = 0; j < n; j++) {
                if (maxPay[j] >= p) {
                    int margin = p - ship[j];
                    if (margin > 0) profit += margin;
                }
            }

            if (profit > bestProfit || (profit == bestProfit && p < bestPrice)) {
                bestProfit = profit;
                bestPrice = p;
            }
        }
        System.out.println(bestProfit == 0 ? 0 : bestPrice);
    }
}
