import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        for (int cs = 1; cs <= t; cs++) {
            int[][] board = new int[9][9];

            for (int i = 0; i < 9; i++) {
                String line = br.readLine();
                while (line != null && line.trim().isEmpty()) {
                    line = br.readLine();
                }

                StringTokenizer st = new StringTokenizer(line);
                for (int j = 0; j < 9; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append("Case ").append(cs).append(": ");
            sb.append(isValid(board) ? "CORRECT" : "INCORRECT").append('\n');
        }

        System.out.print(sb);
    }

    private static boolean isValid(int[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[10];
            boolean[] col = new boolean[10];

            for (int j = 0; j < 9; j++) {
                int r = board[i][j];
                int c = board[j][i];

                if (row[r]) return false;
                if (col[c]) return false;

                row[r] = true;
                col[c] = true;
            }
        }

        for (int sy = 0; sy < 9; sy += 3) {
            for (int sx = 0; sx < 9; sx += 3) {
                boolean[] check = new boolean[10];
                for (int y = sy; y < sy + 3; y++) {
                    for (int x = sx; x < sx + 3; x++) {
                        int v = board[y][x];
                        if (check[v]) return false;
                        check[v] = true;
                    }
                }
            }
        }

        return true;
    }
}