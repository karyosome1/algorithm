import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] s = a.clone();
        Arrays.sort(s);

        Map<Integer, ArrayDeque<Integer>> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int v = s[i];
            m.computeIfAbsent(v, k -> new ArrayDeque<>()).addLast(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int p = m.get(a[i]).pollFirst();
            sb.append(p);
            if (i + 1 < n) {
                sb.append(' ');
            }
        }
        System.out.print(sb);
    }
}