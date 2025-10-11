import java.io.*;
import java.util.*;

public class Main {
    static boolean rowHasGuard(char[][] board, int rowIndex) {
        for (char ch : board[rowIndex]) if (ch == 'X') return true;
        return false;
    }

    static boolean colHasGuard(char[][] board, int colIndex) {
        for (char[] row : board) if (row[colIndex] == 'X') return true;
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }

        int emptyRows = 0;
        for (int r = 0; r < board.length; r++) {
            if (!rowHasGuard(board, r)) emptyRows++;
        }

        int emptyCols = 0;
        for (int c = 0; c < board[0].length; c++) {
            if (!colHasGuard(board, c)) emptyCols++;
        }
        System.out.println(Math.max(emptyRows,emptyCols));
    }
}