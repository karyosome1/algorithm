import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A= Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> seenIndex = new HashMap<>();
        int idx = 0;
        int cur = A;

        while (!seenIndex.containsKey(cur)) {
            seenIndex.put(cur, idx);
            cur = cal(cur, P);
            idx++;
        }

        System.out.println(seenIndex.get(cur));
    }

    public static int cal(int x, int p) {
        int sum = 0;

        while (x > 0) {
            int digit = x % 10;
            int pow = 1;
            for (int i = 0; i < p; i++) {
                pow *= digit;
            }
            sum += pow;
            x /= 10;
        }

        return sum;
    }
}