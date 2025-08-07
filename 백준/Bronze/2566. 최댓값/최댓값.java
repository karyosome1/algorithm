import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final int SIZE = 9;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < SIZE; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < SIZE; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);
    }
}
