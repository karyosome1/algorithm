import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] counts = new int [M][4];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                char c= s.charAt(j);
                if (c == 'A') counts[j][0]++;
                else if (c == 'C') counts[j][1]++;
                else if (c == 'G') counts[j][2]++;
                else counts[j][3]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        int distSum = 0;

        for (int j = 0; j < M; j++) {
            int bestIdx = 0;
            int bestCnt = counts[j][0];

            for (int k = 1; k < 4; k++) {
                if (counts[j][k] > bestCnt) {
                    bestCnt = counts[j][k];
                    bestIdx = k;
                }
            }

            sb.append(idxToChar(bestIdx));
            distSum += (N - bestCnt);
        }

        System.out.println(sb);
        System.out.println(distSum);
    }

    static char idxToChar(int idx) {
        if (idx == 0) return 'A';
        if (idx == 1) return 'C';
        if (idx == 2) return 'G';
        return 'T';
    }
}