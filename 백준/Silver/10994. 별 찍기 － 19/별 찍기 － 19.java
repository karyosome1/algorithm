import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println("*");
            return;
        }

        int size = 4 * (N - 1) + 1;
        char[][] pan = new char[size][size];

        for (int i = 0; i < size; i++) {
            Arrays.fill(pan[i], ' ');
        }

        drawStar(0, pan, N);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(pan[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }

    public static void drawStar(int start, char[][] array, int n) {
        if (n <= 0) return;

        int currentLen = 4 * (n - 1) + 1;
        int end = start + currentLen - 1;

        for (int i = start; i <= end; i++) {
            array[start][i] = '*';
            array[end][i] = '*';
            array[i][start] = '*';
            array[i][end] = '*';
        }

        drawStar(start + 2, array, n - 1);
    }
}