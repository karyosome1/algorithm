import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] wheel = new char[N];
        Arrays.fill(wheel, '?');

        int arrow = 0;

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);

            arrow = (arrow - (S % N) + N) % N;

            if (wheel[arrow] != '?') {
                if (wheel[arrow] != c) {
                    System.out.println("!");
                    return;
                }
            }
            else {
                if (isDuplicate(wheel, c)) {
                    System.out.println("!");
                    return;
                }
                wheel[arrow] = c;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int idx = (arrow + i) % N;
            sb.append(wheel[idx]);
        }

        System.out.println(sb);
    }

    private static boolean isDuplicate(char[] wheel, char c) {
        for (char w : wheel) {
            if (w == c) {
                return true;
            }
        }
        return false;
    }
}
