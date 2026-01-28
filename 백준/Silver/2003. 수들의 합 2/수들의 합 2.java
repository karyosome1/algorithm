import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] a = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0, right = 0;
        long sum = 0;
        int cnt = 0;

        while (true) {
            if (sum >= M) {
                if (sum == M) cnt++;
                sum -= a[left++];
            } else {
                if (right == N) break;
                sum += a[right++];
            }
        }

        System.out.println(cnt);
    }
}