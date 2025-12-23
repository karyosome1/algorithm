import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int g = Integer.parseInt(br.readLine());
            int[] arr = new int[g];
            for (int i = 0; i < g; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            int m = 1;
            HashSet<Integer> set = new HashSet<>(g * 2);

            while (true) {
                set.clear();
                boolean ok = true;

                for (int i = 0; i < g; i++) {
                    int r = arr[i] % m;
                    if (!set.add(r)) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    sb.append(m).append('\n');
                    break;
                }
                m++;
            }
        }
        System.out.print(sb);
    }
}