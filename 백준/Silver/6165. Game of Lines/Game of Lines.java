import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = read();
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) arr[i] = new Pair(read(), read());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = arr[j].x - arr[i].x;
                int dy = arr[j].y - arr[i].y;

                int g = gcd(dx, dy);
                dx /= g;
                dy /= g;

                if (dx < 0) {
                    dx *= -1;
                    dy *= -1;
                } else if (dx == 0) {
                    dy = 1;
                } else if (dy == 0) {
                    dx = 1;
                }

                set.add(dx + "," + dy);
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
    }

    private static int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    private static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        boolean flag = n == 13;

        if (flag) n = System.in.read() & 15;
        while ((c = System.in.read()) > 32)
            n = (n << 3) + (n << 1) + (c & 15);

        return flag ? ~n + 1 : n;
    }
}
