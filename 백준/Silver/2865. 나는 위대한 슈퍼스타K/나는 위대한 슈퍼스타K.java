import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double[] maxScore = new double[n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int idx = Integer.parseInt(st.nextToken()) - 1;
                double value = Double.parseDouble(st.nextToken());
                maxScore[idx] = Math.max(maxScore[idx], value);
            }
        }

        Arrays.sort(maxScore);

        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += maxScore[n - 1 - i];
        }

        System.out.printf("%.1f\n", sum);
    }
}