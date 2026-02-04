import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] pos = new int[26][2];
    static int[] rowCnt = new int[5];
    static int[] colCnt = new int[5];
    static int mainDiagCnt = 0;
    static int antiDiagCnt = 0;
    static int bingoCnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int n = Integer.parseInt(st.nextToken());
                pos[n][0] = i;
                pos[n][1] = j;
            }
        }

        int callCount = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int n = Integer.parseInt(st.nextToken());
                callCount++;

                if (markAndCheck(n)) {
                    System.out.println(callCount);
                    return;
                }
            }
        }
    }

    static boolean markAndCheck(int n) {
        int r = pos[n][0];
        int c = pos[n][1];

        if (++rowCnt[r] == 5) bingoCnt++;
        if (++colCnt[c] == 5) bingoCnt++;
        if (r == c && ++mainDiagCnt == 5) bingoCnt++;
        if (r + c == 4 && ++antiDiagCnt == 5) bingoCnt++;

        return bingoCnt >= 3;
    }
}
