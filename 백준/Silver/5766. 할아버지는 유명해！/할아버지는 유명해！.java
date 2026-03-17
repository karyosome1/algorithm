import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) break;

            int[] score = new int[10001];
            int first = 0;
            int second = -1;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    int player = Integer.parseInt(st.nextToken());
                    score[player]++;
                }
            }

            for (int i = 1; i <= 10000; i++) {
                if (score[i] > first) {
                    first = score[i];
                }
            }

            for (int i = 1; i <= 10000; i++) {
                if (score[i] != first && score[i] > second) {
                    second = score[i];
                }
            }

            for (int i = 1; i <= 10000; i++) {
                if (score[i] == second) {
                    sb.append(i).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}