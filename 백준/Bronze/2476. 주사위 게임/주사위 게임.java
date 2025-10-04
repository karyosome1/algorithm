import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] d = {
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken())
            };
            Arrays.sort(d);

            int prize;
            if (d[0] == d[2]) {
                prize = 10000 + d[0] * 1000;
            } else if (d[0] == d[1] || d[1] == d[2]) {
                prize = 1000 + d[1] * 100;
            } else {
                prize = d[2] * 100;
            }
            ans = Math.max(ans, prize);
        }
        System.out.print(ans);
    }
}
