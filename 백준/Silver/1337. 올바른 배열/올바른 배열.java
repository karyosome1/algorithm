import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(br.readLine());
        Arrays.sort(a);

        int ans = 4;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && a[j] - a[i] <= 4) j++;
            int count = j - i;
            ans = Math.min(ans, 5 - count);
        }

        System.out.println(ans);
    }
}
