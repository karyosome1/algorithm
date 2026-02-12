import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int t = Integer.parseInt(br.readLine());
        int result = 0;
        int[] window = new int[9];

        for (int i = 0; i <= r - 3; i++) {
            for (int j = 0; j <= c - 3; j++) {
                int idx = 0;
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        window[idx++] = arr[x][y];
                    }
                }

                Arrays.sort(window);
                if (window[4] >= t) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}