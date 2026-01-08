import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(p);

        int bestPrice = Integer.MAX_VALUE;
        long bestRevenue = -1;

        for (int i = 0; i < m; i++) {
            int buyers = m - i;
            int sell = Math.min(n, buyers);
            long revenue = (long) p[i] * sell;

            if (revenue > bestRevenue || (revenue == bestRevenue && p[i] < bestPrice)) {
                bestRevenue = revenue;
                bestPrice = p[i];
            }
        }

        System.out.println(bestPrice + " " + bestRevenue);
    }
}