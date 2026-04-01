import java.io.*;

public class Main {
    static char[][] board = new char[3][3];
    static char player;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            for (int i = 0; i < 3; i++) {
                String line = br.readLine();
                for (int j = 0; j < 3; j++) {
                    board[i][j] = line.charAt(j);
                }
            }
            player = br.readLine().charAt(0);

            moveAndWin();

            sb.append("Case ").append(tc).append(":\n");
            for (int i = 0; i < 3; i++) {
                sb.append(board[i][0]).append(board[i][1]).append(board[i][2]).append('\n');
            }
        }

        System.out.print(sb);
    }

    static void moveAndWin() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != '-') continue;

                board[i][j] = player;
                if (isWin(player)) return;
                board[i][j] = '-';
            }
        }
    }

    static boolean isWin(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true;
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
        }

        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true;
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true;

        return false;
    }
}