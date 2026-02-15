import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        char[][] board = new char[M * 5 + 1][N * 5 + 1];
        for (int i = 0; i < board.length; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int[] res = new int[5];

        for (int floor = 0; floor < M; floor++) {
            for (int col = 0; col < N; col++) {
                int startR = floor * 5 + 1;
                int startC = col * 5 + 1;

                int cnt = 0;
                for (int i = 0; i < 4; i++) {
                    if (board[startR + i][startC] != '*') break;
                    cnt++;
                }
                res[cnt]++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i > 0) sb.append(' ');
            sb.append(res[i]);
        }
        System.out.println(sb);
    }
}