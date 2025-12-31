import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int minPackage = Integer.MAX_VALUE;
        int minUnit = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            minPackage = Math.min(minPackage, Integer.parseInt(st.nextToken()));
            minUnit = Math.min(minUnit, Integer.parseInt(st.nextToken()));
        }

        int packageCount = n / 6;
        int remain = n % 6;

        int cost1 = ((n + 5) / 6) * minPackage;
        int cost2 = n * minUnit;
        int cost3 = packageCount * minPackage + remain * minUnit;

        System.out.println(Math.min(cost1, Math.min(cost2, cost3)));
    }
}
