import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long t = Long.parseLong(st.nextToken());

        long ans = Long.MAX_VALUE;

        for (int idx = 0; idx < n; idx++) {
            st = new StringTokenizer(br.readLine());
            long s = Long.parseLong(st.nextToken());
            long i = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            long last = s + i * (c - 1);

            long dep;
            if (t <= s) {
                dep = s;
            } else {
                long d = t - s;
                long k = (d + i - 1) / i;
                dep = s + k * i;
            }
            if (dep <= last) ans = Math.min(ans, dep);
        }
        System.out.println(ans == Long.MAX_VALUE ? -1 : ans - t);
    }
}