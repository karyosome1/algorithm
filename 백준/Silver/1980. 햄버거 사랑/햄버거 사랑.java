import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int coke = t;
        int cnt = 0;

        for (int i = t / n; i >= 0; i--) {
            for (int j = t / m; j >= 0; j--) {
                int remain = t - (n * i + m * j);

                if (remain >= 0 && remain < coke) {
                    coke = remain;
                    cnt = i + j;
                } else if (remain == coke && i + j > cnt) {
                    cnt = i + j;
                }
            }
        }

        System.out.println(cnt + " " + coke);
    }
}
