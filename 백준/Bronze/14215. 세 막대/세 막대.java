import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(maxPerimeter(a, b, c));
    }

    private static int maxPerimeter(int a, int b, int c) {
        int[] s = {a, b, c};
        Arrays.sort(s);

        if (s[0] + s[1] > s[2]) {
            return s[0] + s[1] + s[2];
        }

        return 2 * (s[0] + s[1]) - 1;
    }
}