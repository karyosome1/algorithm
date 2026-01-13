import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] g = new char[N][M];
        for (int i = 0; i < N; i++) {
            g[i] = br.readLine().toCharArray();
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (g[i][j] == '-') {
                    if (j == 0 || g[i][j - 1] == '|') ans++;
                } else {
                    if (i == 0 || g[i - 1][j] == '-') ans++;
                }
            }
        }
        System.out.println(ans);
    }
}