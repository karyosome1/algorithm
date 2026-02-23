import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] removed = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (removed[i]) continue;

            for (int j = i; j <= n; j += i) {
                if (!removed[j]) {
                    removed[j] = true;
                    if (--k == 0) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }
}