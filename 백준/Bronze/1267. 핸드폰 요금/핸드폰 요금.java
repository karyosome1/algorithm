import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;

        int sumY = 0;
        int sumM = 0;

        for (int i = 0; i < n; i++) {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            int sec =Integer.parseInt(st.nextToken());
            sumY += cost(sec, 30, 10);
            sumM += cost(sec, 60, 15);
        }

        StringBuilder out = new StringBuilder();
        if (sumY < sumM) {
            out.append("Y ").append(sumY);
        } else if (sumY > sumM) {
            out.append("M ").append(sumM);
        } else {
            out.append("Y M ").append(sumY);
        }
        System.out.print(out);
    }

    private static int cost(int seconds, int unit, int pricePerUnit) {
        return (seconds / unit + 1) * pricePerUnit;
    }
}