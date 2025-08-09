import java.io.*;
import java.util.*;

public class Main {
    static final int CANVAS = 100;
    static final int SIZE = 10;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[][] filled = new boolean[CANVAS][CANVAS];
        int area = 0;

        for (int k = 0; k < n; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int i = x; i < x + SIZE; i++) {
                for (int j = y; j < y + SIZE; j++) {
                    if (!filled[i][j]) {
                        filled[i][j] = true;
                        area++;
                    }
                }
            }
        }
        System.out.println(area);
    }
}
