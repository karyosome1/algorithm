import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        if (M - m < T) {
            System.out.println(-1);
            return;
        }

        int currentPulse = m;
        int time = 0;

        while (N > 0) {
            if (currentPulse + T <= M) {
                currentPulse += T;
                N--;
            } else {
                currentPulse = Math.max(currentPulse - R, m);
            }
            time++;
        }
        System.out.println(time);
    }
}